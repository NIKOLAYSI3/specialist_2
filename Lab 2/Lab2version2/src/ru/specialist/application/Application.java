package ru.specialist.application;

import ru.specialist.lab2.BankAccount;

public class Application {

	public static void main(String[] args) {
		// лабораторная работа 2

		BankAccount b1 = new BankAccount("Nikolay");
		BankAccount b2 = new BankAccount("Alexey");
		BankAccount b3 = new BankAccount("Igor");
		
		b1.deposit(120);
		System.out.println(b1);
		
		b2.deposit(60);
		System.out.println(b2);
		
		b3.deposit(140);
		System.out.println(b3);
		
		BankAccount.transfer(b3, b2, 16);
		
		System.out.printf("\n");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		
	}

}
