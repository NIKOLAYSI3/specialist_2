package ru.specialist.lab1;

public class BankAccount {

	private String owner;
	private int balance;

	protected String getOwner() {
		return owner;
	}

	protected int getBalance() {
		return balance;
	}

	protected void deposit(int summa) {
		if (summa < 0)
			throw new IllegalArgumentException("Сумма не должны быть меньше 0!");
		this.balance += summa;

	}

	protected boolean withdraw(int summ) {
		// проверка на списание отрицательного числа + проверка если сумма списания больше баланса, то ошибка
		if (summ < 0)
			throw new IllegalArgumentException("Сумма не должны быть меньше 0!");
		if (getBalance() >= summ) {
			this.balance -= summ;
			return true;
		} else
			return false;
	}

	protected static boolean transfer(BankAccount source, BankAccount dest, int summ) {
		if(source.withdraw(summ)) {
			dest.deposit(summ);
			return true;
		} else
			return false;
		
	}

	public BankAccount(String owner) {
		this.owner = owner;
		this.balance = 0;
	}

	
	  @Override 
	  public String toString(){
		  return String.format("%s: %d", getOwner(), getBalance());
		  }
	 

}
