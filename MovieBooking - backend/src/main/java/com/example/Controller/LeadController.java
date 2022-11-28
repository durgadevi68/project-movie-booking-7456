package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Lead;
import com.example.service.LeadServices;

@RestController
@RequestMapping(path="/lead")
public class LeadController {
      
   @Autowired
  LeadServices leadService;

@CrossOrigin   
@PostMapping(path="/save")
public ResponseEntity<String>getLeads(@RequestBody Lead lead){
	if(leadService.saveLeads(lead)){
		return new ResponseEntity<>("Lead saved",HttpStatus.OK);
		
	}else {
		return new ResponseEntity<>("Lead falied to save",HttpStatus.INTERNAL_SERVER_ERROR);
	
       }
	}
	
}








