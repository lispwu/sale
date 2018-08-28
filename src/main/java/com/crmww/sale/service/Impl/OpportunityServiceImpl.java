package com.crmww.sale.service.Impl;

import com.crmww.sale.dao.OpportunityDAO;
import com.crmww.sale.model.OpportunityDTO;
import com.crmww.sale.service.OpportunityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class OpportunityServiceImpl  implements OpportunityService{

    private Logger logger = LoggerFactory.getLogger(OpportunityServiceImpl.class);

    @Autowired
    private OpportunityDAO opportunityDAO;



    @Override
    public List<OpportunityDTO> getAll(OpportunityDTO opportunityDTO) {
        logger.debug("OpportunityServiceImpl getAll------------",opportunityDTO.toString());
        if (opportunityDTO.getPage() != null && opportunityDTO.getRows() != null) {
            PageHelper.startPage(opportunityDTO.getPage(), opportunityDTO.getRows());
        }
        Example example = new Example(OpportunityDTO.class);
        Example.Criteria criteria = example.createCriteria();
        if (opportunityDTO.getCustomerName() != null && opportunityDTO.getCustomerName().length() > 0) {
            criteria.andLike("customerName", "%" + opportunityDTO.getCustomerName() + "%");
        }
        if(StringUtil.isNotEmpty(opportunityDTO.getOpptName())){
            criteria.andLike("opptName","%" + opportunityDTO.getOpptName() + "%");
        }
        return opportunityDAO.selectByExample(example);
    }

    @Override
    public void save(OpportunityDTO opportunityDTO) {
        logger.debug("OpportunityServiceImpl save",opportunityDTO.toString());
        if(opportunityDTO.getOpptId() != null){
            opportunityDAO.updateByPrimaryKey(opportunityDTO);
        }else{
            opportunityDAO.insert(opportunityDTO);
        }
    }

}
