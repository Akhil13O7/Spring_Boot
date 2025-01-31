package com.bankapp.service;

import java.util.List;

import com.bankapp.entity.Account;

public interface AccountService {
	
	public Account createAccount(Account account);
	
	public Account getAccountDetailsByAccountNumber(Account account);
	
	public List<Account> getAllAccountDetails();
	
	public Account depositAmount(Long accountNumber, Double amount);
	
	public Account WithdrawAmount(Long accountNumber, Double amount);
	
	public void closeAccount(Long accountNumber);

}
