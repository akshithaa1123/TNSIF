package com.tnsif.assignment1;

public class BankAccMain {

		public static void main(String[] args) {
	        try {
	            BankAcc myAcc = new BankAcc(1,1000);
	            myAcc.showBalance();
	            myAcc.deposit(500);
	            myAcc.withdraw(234);
	            myAcc.showBalance();
	        } catch (InvalidAmountException e) {
	            System.out.println("Invalid amount entered");
	        } catch (InSufficientAmountException e) {
	            System.out.println("Not enough balance to withdraw");
	        } finally {
	            System.out.println("Banking complete");
	        }
	    }
	}
