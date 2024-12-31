package com.ust.oops;
//data abstraction
abstract class Account{// cannot be instantiated
	abstract void deposit(int amount);
	abstract void withdrawl(int amount);
	void show() {
		System.out.println(" show.....");
	}
}
class AccountImpl extends Account{
	int balance;
	void deposit(int amount) {
		System.out.println(this.balance+amount);
	}
	void withdrawl(int amount) {
		System.out.println(this.balance-amount);
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Account account =new AccountImpl();  //=new Account();
		account.deposit(5000);
		account.withdrawl(2000);
		account.show();
	}
}
