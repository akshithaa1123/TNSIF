package com.tnsif.exceptionhandling;

	public class WithoutException {

		public static void main(String[] args) {
			try{
				int a=10;
				int b=0;
				int result=a/b;
				int arr[]={1,2,3,4};
				arr[5]=7;
				System.out.println("the result is "+result);
				System.out.println("the result is "+arr[5]);
			}
			catch(ArithmeticException e) {
				System.out.println("a number cannot be divided by zero");
			}
			catch(Exception e) {
				System.out.println("given array is not existing");
			}
		}
	}

