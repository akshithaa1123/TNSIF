package com.tnsif.constructordemo;

public class Book {
		String title;
		Book(String title){
			this.title=title;
		}
		Book(Book b){
			this.title=b.title;
		}
		void display() {
			System.out.println("the title of book "+title);
		}
		public static void main(String[] args) {
			Book ob=new Book("JFS");
			Book o=new Book(ob);
			ob.display();
			o.display();
		}
	}
