package com.tnsif.oopsconcepts;

class Animal {
	 void eat() {
	        System.out.println("Every animal eats");
	    }
	}


class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Animals {
	public static void main(String[] args) {
        Dog ob = new Dog();
        ob.eat();  
        ob.sound(); 
    }
}

