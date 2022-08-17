package com.mindgate.Hashsetmain;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Empoyee;

public class EmployeeSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Empoyee> empoyeesSet = new HashSet<>();

		Empoyee e1 = new Empoyee(0, "X", 10);
		System.out.println("e1:: " + e1.hashCode());

		Empoyee e2 = new Empoyee(1, "Y", 20);
		System.out.println("e1:: " + e2.hashCode());

		empoyeesSet.add(e1);
		empoyeesSet.add(e2);
		System.out.println(empoyeesSet);
	}

}
