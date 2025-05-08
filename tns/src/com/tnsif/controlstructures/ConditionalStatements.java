package com.tnsif.controlstructures;
import java.util.Scanner;
public class ConditionalStatements {

		public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        // 1. If-else statement
	        System.out.print("if-else example: ");
	        int num1 = input.nextInt();
	        if (num1 > 0) {
	            System.out.println("The number is positive.");
	        } else if (num1 < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
	        // 2. Switch statement
	        System.out.print("\nSwitch Case Example: ");
	        int day = input.nextInt();
	        switch (day) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("Invalid day number.");
	                break;
	        }
	        input.close();
	   }
	}

