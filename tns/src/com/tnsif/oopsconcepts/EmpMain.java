package com.tnsif.oopsconcepts;

public class EmpMain {
	public static void main(String args[]) {
		Employees ob=new Employees();
		ob.setEid(1);
		System.out.println(ob.getEid());
		ob.setEname("akshitha");
		System.out.println(ob.getEname());
		ob.setSal(20.5f);
		System.out.println(ob.getSal());
	}
}
