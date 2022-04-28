package com.rakuten.processpension.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rakuten.processpension.entities.PensionDetail;
import com.rakuten.processpension.entities.PensionerDetail;
import com.rakuten.processpension.entities.ProcessPensionInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/ProcessPension")
public class ProcessPensionController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping
	String processPension(@RequestBody ProcessPensionInput processPensionInput) {
		System.out.println("Fetching Details Of This Aadhar Number:: " + processPensionInput.getAadhar_number());
		
		String restTemplateUrl = "http://localhost:8081/PensionerDetailByAadhaar/" + processPensionInput.getAadhar_number();
		PensionerDetail fetchDetailFromSavedData = restTemplate.getForObject(restTemplateUrl, PensionerDetail.class);
		
		return "Name Fetched From Aadhar Number:: " + fetchDetailFromSavedData.getName();
	}
}
