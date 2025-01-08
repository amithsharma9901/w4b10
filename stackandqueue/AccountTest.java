package com.ust.collections.stackandqueue;

public class AccountTest {

	public static void main(String[] args) {
		AccountService ac=new AccountService();
		Account account=new Account();
		account.setAcNumber(12345);
		account.setName("Ram");
		account.setBalance(10000.00);
		System.out.println("===adding account");
		ac.addAccount(account);
		System.out.println("===listing all account");
		ac.listAllAccounts();

	}

}
