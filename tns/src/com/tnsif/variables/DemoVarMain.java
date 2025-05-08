package com.tnsif.variables;

public class DemoVarMain {
	public static void main(String[] args) {
		//instance of the class
		TypesVarDemo ob=new TypesVarDemo();
		ob.numone=23;
		//instance variable call
		int result=ob.numone=10;
		System.out.println("This is instance variable output "+result);
		//local variable
		ob.display();
		//static variable
		System.out.println("This is static variable output "+TypesVarDemo.numthree);	
	}
}
