package com.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.entity.Account;
import com.bankapp.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	
	@Autowired
	AccountService service;
	
	@PostMapping("/create")
	public Account createAccount(@RequestBody Account account) {
		Account createAccount = service.createAccount(account);
		return createAccount;
	}
	
}
