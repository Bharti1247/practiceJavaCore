package com.learn.bank;

public class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private float balance;
	
	public void deposit(float bal) {
		this.balance += bal;
	}
	
	public float withdraw(float bal) {
		if (this.balance > bal) {
			this.balance -= bal;
			return bal;
		}
		return 0;
	}
	
	void setAccountNumber(String accNum) {
		this.accountNumber = accNum;
	}
	
	void setAccountHolderName(String name) {
		this.accountHolderName = name;
	}
	
	void setBalance(float bal) {
		this.balance = bal;
	}
	
	float getBalance() {
		return balance;
	}

	String getAccountNumber() {
		return accountNumber;
	}

	String getAccountHolderName() {
		return accountHolderName;
	}
	
	BankAccount(String name, String accNum, float bal){
		this.accountHolderName = name;
		this.accountNumber = accNum;
		this.balance = bal;
	}

}
