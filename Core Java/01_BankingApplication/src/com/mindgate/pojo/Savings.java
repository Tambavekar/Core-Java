package com.mindgate.pojo;

public class Savings extends Account {

	private boolean issalary;

	public Savings() {

	}

	public Savings(int accountNumber, String name, double balance, boolean issalary) {
		super(accountNumber, name, balance);
		this.issalary = issalary;
	}

	@Override
	public boolean withdraw(double amount) {
		if (issalary) {
			if (amount > 0 && getBalance() >= amount) {
				setBalance(getBalance() - amount);
				return true;
			}
		} else {
			if (amount > 0 && (getBalance() - amount) >= 2000) {
				setBalance(getBalance() - amount);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

}
