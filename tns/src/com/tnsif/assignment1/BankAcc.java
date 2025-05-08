package com.tnsif.assignment1;

public class BankAcc {
		int accountNumber;
	    double balance;
	    // Constructor
	    BankAcc(int number, double initialBalance) throws InvalidAmountException {
	        if (initialBalance<0) {
	            throw new InvalidAmountException("Balance cannot be negative");
	        }
	        accountNumber = number;
	        balance=initialBalance;
	    }
		// Deposit method
	    void deposit(double amount) throws InvalidAmountException {
	        if (amount<= 0) {
	            throw new InvalidAmountException("Amount must be more than 0");
	        }
	        balance=balance+amount;
	        System.out.println("Deposited: "+amount);
	    }
	    // Withdraw method
	    void withdraw(double amount) throws InSufficientAmountException, InvalidAmountException {
	        if (amount<=0) {
	            throw new InvalidAmountException("Amount must be more than 0");
	        }
	        if (amount>balance) {
	            throw new InSufficientAmountException("Not enough money");
	        }
	        balance=balance-amount;
	        System.out.println("Withdrawn: "+amount);
	    }
	    // Show balance
	    void showBalance() {
	        System.out.println("Account: "+accountNumber);
	        System.out.println("Balance: "+balance);
	    }
	}
