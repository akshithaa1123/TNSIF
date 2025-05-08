package com.tnsif.interfacedemo;

public class BankImple extends Bank {
	private double balance=1500;
	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("the amount after withdraw "+balance);
		}
		else {
			System.err.print("insufficient amount");
		}
	}
	@Override
	public void deposit(double amount) {
		if(amount<DEPOSIT_LIMIT) {
			balance=balance+amount;
			System.out.println("the amount after deposit  "+balance);
		}
		else {
			System.err.print("exceeds deposit limit");
		}
	}
}
