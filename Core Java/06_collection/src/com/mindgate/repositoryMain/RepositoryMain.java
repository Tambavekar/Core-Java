package com.mindgate.repositoryMain;

import java.util.Iterator;
import java.util.List;

import com.mindgate.pojo.Empoyee;
import com.mindgate.repository.EmployeeRepository;

public class RepositoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRepository employeeRepository = new EmployeeRepository();

		Empoyee empoyee1 = new Empoyee(001, "Divya", 450000.0);
		Empoyee empoyee2 = new Empoyee(002, "Rahul", 450000.0);
		Empoyee empoyee3 = new Empoyee(003, "Vinay", 450000.0);

		List<Empoyee> empoyees = employeeRepository.getAllEmpoyees();
		employeeRepository.addEmployee(empoyee1);
		employeeRepository.addEmployee(empoyee2);
		employeeRepository.addEmployee(empoyee3);

		for (Empoyee e : empoyees) {
			System.out.println(e);
		}

		System.out.println();
		Empoyee e = employeeRepository.getEmpoyeeByEmpoyeeId(210);
		System.out.println(e);

		System.out.println("Before");
		List<Empoyee> b = employeeRepository.getAllEmpoyees();

		for (Empoyee a : b) {
			System.out.println(a);

		}

		boolean result = employeeRepository.deleteEmpById(2);
		System.out.println();
		System.out.println("After");

		List<Empoyee> c = employeeRepository.getAllEmpoyees();

		for (Empoyee a : c) {
			System.out.println(a);

		}

		Empoyee upempoyee = new Empoyee(3, "Rohan", 22230.50);
		boolean resu = employeeRepository.updateEmpById(upempoyee);

		System.out.println();
		System.out.println("After update");

		List<Empoyee> f = employeeRepository.getAllEmpoyees();

		for (Empoyee a : f) {
			System.out.println(a);

		}

	}

}
