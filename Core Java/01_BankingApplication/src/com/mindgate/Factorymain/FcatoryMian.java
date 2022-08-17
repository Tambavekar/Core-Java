package com.mindgate.Factorymain;

import java.util.Scanner;

import com.mindgate.factory.AccountFactory;
import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Savings;

public class FcatoryMian {
	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();
		Scanner sc = new Scanner(System.in);
		System.out.println("choise 1 for saving and 2 for current");

		int choice = sc.nextInt();
		Account account = accountFactory.getAccount(choice);
		System.out.println("Account object created!!");

		if (account instanceof Savings)
			System.out.println("saving object created");
		if (account instanceof Current)
			System.out.println("Current object created ");
	}
}
