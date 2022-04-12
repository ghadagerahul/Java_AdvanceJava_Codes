package com.program.solidprinciple;

import javax.swing.Spring;

public class Bookdata<Bookstore> {
	
	String bookname;
	String author;
	int price;
	
	

	public Bookdata(String bookname, String author, int price) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}

	
	{
		System.out.println("welcome to book store...!");
	}
	
	public void printinvoice(Bookdata b1, int quantity) {
		
		double price=price(b1, quantity);
		System.out.println("the name of the book is the   "+ bookname);
		System.out.println("autioer of this book is  "+ author);
		System.out.println("price of book is "+price);
	}
	
	public double price(Bookdata b, int quantity) {
		
		double price = b.price *quantity;
		return price;
	}


	public static void main(String[] args) {
		
		Bookdata b1=new Bookdata("wings","self", 250);
		
		b1.printinvoice(b1, 10);
		
		

	}

}
