package com.crmww.sale.controller;

import com.crmww.sale.model.OpportunityDTO;
import com.crmww.sale.service.OpportunityService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/opportunity")
public class OpportunityController {

    private Logger logger = LoggerFactory.getLogger(OpportunityController.class);

    @Resource
    private OpportunityService opportunityService;

    @RequestMapping("createOpportunity")
    public String createOpportunity(OpportunityDTO opportunityDTO){
        logger.debug("OpportunityController  createOpportunity",opportunityDTO.toString());
        opportunityService.save(opportunityDTO);
        return "OK";
    }

    @RequestMapping("queryOpportunityByConditions")
    public PageInfo<OpportunityDTO> queryOpportunityByConditions(OpportunityDTO opportunityDTO) {
        logger.debug("OpportunityController  getAll",opportunityDTO.toString());
        List<OpportunityDTO> opportunityDTOS = opportunityService.getAll(opportunityDTO);
        return new PageInfo<>(opportunityDTOS);
    }
}
