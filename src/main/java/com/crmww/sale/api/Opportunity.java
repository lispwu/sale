package com.crmww.sale.api;

import com.crmww.sale.model.OpportunityDTO;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/opportunity")
@Api("商机api")
public interface Opportunity {

    @RequestMapping("queryByConditions")
    @ApiOperation("根据条件查询商机")
    public PageInfo<OpportunityDTO> queryByConditions(OpportunityDTO opportunityDTO);

    @RequestMapping("createOpportunity")
    @ApiOperation("创建商机")
    public String createOpportunity();

}
