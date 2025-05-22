package com.tnsif.lamdaexpdemo;

import java.util.function.Predicate;

//predefined functional interfaces
public class PredicateDemo {
	public static void main(String[] args) {
		//test is the abstract method of predicate
		Predicate<String> p=str->str.length()>5;
		System.out.println(p.test("lavanya"));//true
		System.out.println(p.test("TNSIF"));//false
	}
}
