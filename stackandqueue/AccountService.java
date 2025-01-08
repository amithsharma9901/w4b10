package com.ust.collections.stackandqueue;

import java.util.Stack;

public class AccountService {
	
	Stack<Account> accountList= new Stack<>();
	
	
	public void addAccount(Account account) {
		accountList.push(account);
		
	}
	public void updateAccount(Integer acNumber,String name,Double amount) {
		
	}
	public void deleteAccount(Integer acNumber) {
		
	}
	public void listAllAccounts() {
		System.out.println(accountList);
	}
	

}
