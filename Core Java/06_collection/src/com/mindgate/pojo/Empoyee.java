package com.mindgate.pojo;

import java.util.Objects;

public class Empoyee {
	private int EmployeeId;
	private String name;
	private double salary;

	
	public Empoyee() {
	}

	public Empoyee(int employeeId, String name, double salary) {
		super();
		EmployeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	

	@Override
	public int hashCode() {
		System.out.println("In hashcode");
		return Objects.hash(EmployeeId, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empoyee other = (Empoyee) obj;
		return EmployeeId == other.EmployeeId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empoyee [EmployeeId=" + EmployeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
