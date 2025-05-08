package com.tnsif.constructordemo;
	import java.util.Scanner;

public class StudentDetails {
	    int sid;
	    String sname;
	    int contact;
	    void display() {
	        System.out.println("The details of the student: " + sid + ", " + sname + ", " + contact);
	    }
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        StudentDetails ob = new StudentDetails(); // Create object
	        // User input
	        System.out.print("Enter Student ID: ");
	        ob.sid = input.nextInt();
	        input.nextLine(); // consume the leftover newline
	        System.out.print("Enter Student Name: ");
	        ob.sname = input.nextLine();
	        System.out.print("Enter Student Contact: ");
	        ob.contact = input.nextInt();
	        // Displaying details
	        ob.display();
	        input.close();
	    }
	}
