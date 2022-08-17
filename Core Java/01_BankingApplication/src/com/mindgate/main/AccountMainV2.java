package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMainV2 {

	public static void main(String[] args) {
		System.out.println("This is AccountMainV2");

		Account account = new Account(400, "Sarika", 40000);

		System.out.println("Withdraw :500");

		boolean result = account.withdraw(500);
		if (result)
			System.out.println("Transacation success!");
		else
			System.out.println(" Transacation Failed");

		System.out.println("Balance ::" + account.getBalance());

	}

}
