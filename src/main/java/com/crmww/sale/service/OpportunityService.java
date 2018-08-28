package com.crmww.sale.service;

import com.crmww.sale.model.OpportunityDTO;


import java.util.List;


public interface OpportunityService {

    List<OpportunityDTO> getAll(OpportunityDTO opportunityDTO);

    void save(OpportunityDTO opportunityDTO);
}
