package com.tnsif.interfacedemo;

public abstract class Bank {
		double DEPOSIT_LIMIT=25000;
		//abstract methods
		abstract void withdraw(double amount);
		abstract void deposit(double amount);
	}

