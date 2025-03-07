package ru.specialist.lab1;

public class AppLab1 {

	public static void main(String[] args) {
		// Лабораторная работа №1
		
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
