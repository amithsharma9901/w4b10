package com.ust.collections.stackandqueue;

public class Account {
	Integer acNumber;
	String name;
	Double balance;
	public Integer getAcNumber() {
		return acNumber;
	}
	public void setAcNumber(Integer acNumber) {
		this.acNumber = acNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [acNumber=" + acNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	

}
