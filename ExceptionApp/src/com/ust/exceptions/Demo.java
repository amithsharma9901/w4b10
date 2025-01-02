package com.ust.exceptions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args)  throws DepositException{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to be deposited");
		int amount=sc.nextInt();
		if (amount<1000)
			throw new DepositException("Minimum amount to be deposited is 1000");
		else
			System.out.println("Deposit is done, Thak you....");
		
	}

}
