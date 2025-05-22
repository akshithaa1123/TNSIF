package com.tnsif.lamdaexpdemo;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
	public static void main(String[] args) {
		List<String> l=Arrays.asList("Allen","Bobby","Chinnu","Alex");
		l.sort((a,b)-> a.compareTo(b));
		l.forEach(names->System.out.println(names));
	}
}
