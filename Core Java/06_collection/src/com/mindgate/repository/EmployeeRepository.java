package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Empoyee;

public class EmployeeRepository {

//	public boolean addEmployee(Empoyee empoyee) {
//		System.out.println(" in EmployeeRepository");
//		System.out.println(empoyee);
//		return true;
//	}

	private List<Empoyee> emplist = new ArrayList<>();

	public boolean addEmployee(Empoyee empoyee) {
		return emplist.add(empoyee);
	}

	public List<Empoyee> getAllEmpoyees() {
		return emplist;
	}

	public Empoyee getEmpoyeeByEmpoyeeId(int employeeId) {
		for (Empoyee empoyee : emplist) {
			if (empoyee.getEmployeeId() == employeeId) {
				return empoyee;
			}
		}
		return null;
	}

	public boolean deleteEmpById(int empid) {
		for (Empoyee empoyee : emplist) {
			if (empoyee.getEmployeeId() == empid) {

				Boolean result = emplist.remove(empoyee);
				return result;
			}
		}
		return false;
	}

	public boolean updateEmpById(Empoyee empoyee) {
		for (Empoyee empoyee1 : emplist) {
			if (empoyee1.getEmployeeId() == empoyee.getEmployeeId()) {
				empoyee1.setEmployeeId(empoyee.getEmployeeId());
				empoyee1.setName(empoyee.getName());
				empoyee1.setSalary(empoyee.getSalary());
				return true;
			}
		}
		return false;
	}
	

}
