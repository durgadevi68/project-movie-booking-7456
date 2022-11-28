package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repo.LeadRepository;
import com.example.model.Lead;

@Service
public class LeadServicesImp implements LeadServices{
 @Autowired
   LeadRepository leadRepository;
	@Override
	public boolean saveLeads(Lead lead) {
		try {
			Lead savedLead=leadRepository.save(lead);
			if(savedLead !=null) {
				return true;
			}else {
				return false;
			}
			
	}catch(Exception e) {
		
		
		
	}
		return false;

   }
}
