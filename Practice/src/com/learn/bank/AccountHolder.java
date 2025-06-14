package com.learn.bank;

import java.util.Scanner;

public class AccountHolder {
	static Scanner scanner = new Scanner(System.in);

	BankAccount ba = new BankAccount("Bharti", "123", 80000);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder person = new AccountHolder();
				
		System.out.println("-----*Welcome to ABC Bank*-----");
		int choice;
		
		do {
			System.out.println("Enter your choice: \n '1' to withdraw \n '2' to deposit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1 : person.withdraw(); break;
			case 2 : person.deposit(); break;
			default : return;
			}
		} while (true);
	}
	
	void withdraw() {
		System.out.print("Enter the amount to withdraw: ");
		float amount = scanner.nextFloat();
		System.out.println();
		float availableBalance = ba.getBalance();
		if (availableBalance > amount) {
			ba.withdraw(amount);
			availableBalance -= amount;
			System.out.printf("Updated available balance : %f\n", availableBalance);
		} else System.out.printf("Insufficient balance\nAvailable Balance : %f\n", availableBalance);
	}
	
	void deposit() {
		System.out.print("Enter the amount to deposit: ");
		float amount = scanner.nextFloat();
		System.out.println();
		float availableBalance = ba.getBalance();
		availableBalance += amount;		
		ba.setBalance(availableBalance);
		System.out.printf("Updated available balance : %f\n", availableBalance);
	}

}
