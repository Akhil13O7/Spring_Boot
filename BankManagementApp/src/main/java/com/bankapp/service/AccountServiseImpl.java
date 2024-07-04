package com.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.entity.Account;
import com.bankapp.repository.AccountRepository;

@Service
public class AccountServiseImpl implements AccountService {
	
	@Autowired
	AccountRepository repo;

	@Override
	public Account createAccount(Account account) {
		Account account_saved = repo.save(account);
		return account_saved;
	}

	@Override
	public Account getAccountDetailsByAccountNumber(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account depositAmount(Long accountNumber, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account WithdrawAmount(Long accountNumber, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeAccount(Long accountNumber) {
		// TODO Auto-generated method stub
		
	}

}
