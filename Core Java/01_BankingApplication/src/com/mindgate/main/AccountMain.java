package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMain {
	public static void main(String[] args) {
		System.out.println("Hello World");

		Account account = new Account();
		
		account.setAccountNumber(3699);
		account.setBalance(00);
		account.setName("Vipul");
		
		System.out.println(account.getAccountNumber());
		System.out.println(account.getBalance());
		System.out.println(account.getName());
		
		System.out.println("________________________");

		
		
		Account account1 = new Account(3699, "rohit", 25673.2);
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getBalance());
		System.out.println(account1.getName());
		
		System.out.println("________________________");
		
		

		Account account2 = new Account(1021, "Vikas", 35673.2);

		System.out.println(account2);
		
	}
}
