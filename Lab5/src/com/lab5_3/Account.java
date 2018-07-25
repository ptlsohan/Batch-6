package com.lab5_3;


abstract public class Account {
	private static long Num=0;
	private long accNum;
	private double balance;
	private Person accHolder;
	public Account() {
		
	}
	
	public Account(double balance, Person accHolder) {
		Num++;
		this.accNum=Num;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	void Deposit(double d) {
		balance+=d;
	}
	abstract void withdraw(double w);
	double getBalance() {
		return balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	
}
