package com.mindgate.main;

import com.mindgate.pojo.Calculation;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Calculation obj = new Calculation();
		obj.accept();
		obj.calculate();
		obj.display();
		System.out.println("main end");

	}

}
