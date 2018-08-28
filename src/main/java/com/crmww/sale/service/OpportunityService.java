package com.crmww.sale.service;

import com.crmww.sale.model.OpportunityDTO;


import java.util.List;


public interface OpportunityService {

    int createOpportunity(OpportunityDTO opportunityDTO);

    List<OpportunityDTO> getAll(OpportunityDTO opportunityDTO);
}
