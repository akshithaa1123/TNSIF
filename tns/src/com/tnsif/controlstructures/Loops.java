package com.tnsif.controlstructures;
import java.util.Scanner;
public class Loops {

		public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	    // 1. For loop
		System.out.println("\nFor loop example: ");
	    for (int i = 1; i <= 5; i++) {
	        System.out.println(i);
	    }
	    // 2. While loop
	    System.out.println("\nWhile loop example: ");
	    int count = 1;
	    while (count <= 5) {
	        System.out.println(count);
	        count++;
	    }
	    // 3. Do-while loop
	    System.out.println("\nDo-while loop example: ");
	    int count2 = 1;
	    do {
	        System.out.println(count2);
	        count2++;
	    } while (count2 <= 5);
	    input.close();
	  }
	}

