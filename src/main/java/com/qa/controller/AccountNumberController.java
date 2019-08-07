package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.AccountNumberService;

@RestController
@RequestMapping("/accountNumber")
public class AccountNumberController {
	
	@Autowired
	public AccountNumberController(AccountNumberService numberService) {
		this.numberService = numberService;
	}

	@Autowired
	public AccountNumberService numberService;

	@RequestMapping("/getAccountNumber6")
	public String getAccountNumber() {
		return numberService.getAccountNumber6();
	}
	
	@RequestMapping("/getAccountNumber8")
	public String getAccountNumber8() {
		return numberService.getAccountNumber8();
	}
	
	@RequestMapping("/getAccountNumber10")
	public String getAccountNumber10() {
		return numberService.getAccountNumber10();
	}
	
}
