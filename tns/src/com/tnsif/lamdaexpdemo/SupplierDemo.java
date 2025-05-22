package com.tnsif.lamdaexpdemo;
import java.util.function.Supplier;

//Demo for Supplier interface
public class SupplierDemo {
	public static void main(String[] args) {
   Supplier<Double> sup=()->Math.random();
   System.out.println(sup.get());	
	}
}
