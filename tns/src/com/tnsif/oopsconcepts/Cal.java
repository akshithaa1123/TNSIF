package com.tnsif.oopsconcepts;
//compile-time polymorphism
public class Cal {
	public int add(int a,int b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public float add(float a,float b,float c) {
		return a+b+c;
	}
	public static void main(String args[]) {
		Cal ob=new Cal();
		System.out.println(ob.add(2.8f,6.0f));
		System.out.println(ob.add(12,8));
		System.out.println(ob.add(1.5f,1.0f,2.5f));
	}
}