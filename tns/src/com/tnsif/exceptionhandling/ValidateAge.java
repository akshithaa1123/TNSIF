package com.tnsif.exceptionhandling;

public class ValidateAge {
	public static void validateAge(int age) throws MyException{
		if(age<0) {
			throw new MyException("the entered age is not valid");
		}
		else {
			System.out.println("the entered age is valid");
		}
	}
}

