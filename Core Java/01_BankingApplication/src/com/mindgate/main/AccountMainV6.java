package com.mindgate.main;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountMainV6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account;
		account = new Savings(101, "Vipul", 3330, false);
		System.out.println(account.withdraw(2000));

	}

}
