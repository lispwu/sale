package com.crmww.sale.service.Impl;

import com.crmww.sale.dao.OpportunityDAO;
import com.crmww.sale.model.OpportunityDTO;
import com.crmww.sale.service.OpportunityService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("OpportunityService")
public class OpportunityServiceImpl  implements OpportunityService{

    @Autowired
    private OpportunityDAO opportunityDAO;

    @Override
    public int createOpportunity(OpportunityDTO opportunityDTO) {
        return opportunityDAO.insert(opportunityDTO);
    }

    @Override
    public List<OpportunityDTO> getAll(OpportunityDTO opportunityDTO) {
        if (opportunityDTO.getPage() != null && opportunityDTO.getRows() != null) {
            PageHelper.startPage(opportunityDTO.getPage(), opportunityDTO.getRows());
        }
        Example example = new Example(OpportunityDTO.class);
        Example.Criteria criteria = example.createCriteria();
        if (opportunityDTO.getCustomerName() != null && opportunityDTO.getCustomerName().length() > 0) {
            criteria.andLike("customerName", "%" + opportunityDTO.getCustomerName() + "%");
        }
        return opportunityDAO.selectByExample(example);
    }

}
