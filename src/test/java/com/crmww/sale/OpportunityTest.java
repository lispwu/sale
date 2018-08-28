package com.crmww.sale;

import com.crmww.sale.controller.OpportunityController;
import com.crmww.sale.model.OpportunityDTO;
import com.crmww.sale.service.OpportunityService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OpportunityTest {

    @Autowired
    private OpportunityService opportunityService;

    @Autowired
    private OpportunityController opportunityController;

    @Test
    public void test(){
        OpportunityDTO opportunityDTO = new OpportunityDTO();
        opportunityDTO.setCustomerName("4");
        List<OpportunityDTO> list = opportunityService.getAll(opportunityDTO);
        System.out.println("wu got " + list.size() + " !!!!!!");
    }

    @Test
    public void testGetAll(){
        OpportunityDTO opportunityDTO = new OpportunityDTO();
        opportunityDTO.setCustomerName("4");
        PageInfo<OpportunityDTO> page = opportunityController.getAll(opportunityDTO);
        System.out.println(page);
    }
}
