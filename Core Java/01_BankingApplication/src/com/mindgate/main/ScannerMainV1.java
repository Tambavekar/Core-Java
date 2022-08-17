package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class ScannerMainV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String name;
			double balance;
			int AccountNumber;
			double amount;
			boolean result;
			String ContinueChoice;

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your AccountNumber");
			AccountNumber = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter your Name");
			name = sc.nextLine();

			System.out.println("Enter your Balance");
			balance = sc.nextDouble();
			Account account = new Account(AccountNumber, name, balance);

        do {
			System.out.println("Choise 1 :Withdraw");
			System.out.println("Choise 2 :Deposit");
			System.out.println("Choise 3 :Balance");

			System.out.println(account);

			int number;
			number = sc.nextInt();
			// switch expression with int value
			switch (number) {
			// switch cases without break statements
			case 1:
				System.out.println("Enter Your Amount");
				amount = sc.nextDouble();
				result = account.withdraw(amount);

				if (result) {
					System.out.println("Transaction Successfull");
				} else {
					System.out.println("Transacation Invaild ");
				}
				break;
			case 2:

				System.out.println("Enter Your Amount");
				amount = sc.nextDouble();
				result = account.deposit(amount);

				if (result) {
					System.out.println("Transaction Successfull");
				} else {
					System.out.println("Transacation Invaild ");
				}
				break;

			case 3:

				System.out.println("Balance ::" + account.getBalance());
				break;

			default:
				System.out.println("Invaild Choice");
				break;
			}
			System.out.println("Do you Want To Continue");
			ContinueChoice = sc.next();
		} while (ContinueChoice.equals("Yes"));

	}

}
