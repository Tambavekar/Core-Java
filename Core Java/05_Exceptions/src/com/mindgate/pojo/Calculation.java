package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
	private int num1;
	private int num2;
	private int result;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = sc.nextInt();
		System.out.println("Enter num2");
		num2 = sc.nextInt();
		try {
			// TODO Auto-generated method stub

		} catch (InputMismatchException e) {
			System.out.println("Invaild input");
		} finally {
			sc.close();
			System.out.println("Thank you");
		}
	}

	public void calculate() {
		System.out.println("calculate");
		result = num1 + num2;
	}

	public void display() {
		System.out.println("result is " + result);

	}
}
