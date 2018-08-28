package com.crmww.sale.controller;

import com.crmww.sale.model.OpportunityDTO;
import com.crmww.sale.service.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/opportunity")
public class OpportunityController {

    @Resource(name = "OpportunityService")
    private OpportunityService opportunityService;

    @RequestMapping("createOpportunity")
    public String createOpportunity(@RequestBody OpportunityDTO opportunityDTO){
        opportunityService.createOpportunity(opportunityDTO);
        return "OK";
    }
}
