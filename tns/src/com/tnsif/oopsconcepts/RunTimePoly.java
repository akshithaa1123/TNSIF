package com.tnsif.oopsconcepts;

	//override
	class Demo{
		public void mesg() {
			System.out.println("this is run time demo call for demo class");
		}
	}
		class Sample extends Demo{
			public void mesg() {
				System.out.println("this is run time demo call for sample class"); 
		}
	}
	public class RunTimePoly {
		public static void main(String[] args) {
			Demo o=new Demo();
			o.mesg();
			Sample ob=new Sample();
			ob.mesg();
		}
	}

