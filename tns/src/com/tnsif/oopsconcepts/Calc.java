package com.tnsif.oopsconcepts;
//constructor overloading polymorphism
public class Calc {
	String message;
	int number;
	Calc(String message){
		this.message=message;
	}
	Calc(int number){
		this.number=number;
	}
	void display() {
		System.out.println(message);
	}
	void print() {
		System.out.println(number);
	}
	public static void main(String[] args) {
		Calc ob=new Calc("this is constructor overloading");
		ob.display();
		Calc o=new Calc(123);
		o.print();
	}
}
