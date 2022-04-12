package com.program.solidprinciple;

import java.io.Serializable;

public class Book implements Serializable {
	
	int Bid;
	int price;
	
	public Book(int bid, int price) {
		super();
		Bid = bid;
		this.price = price;
	}
	

}
