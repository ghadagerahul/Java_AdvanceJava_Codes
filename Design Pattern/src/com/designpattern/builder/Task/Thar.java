package com.designpattern.builder.Task;

public class Thar {

	String model;
	String varient;
	double price;

	public Thar(String model, String varient, double price) {
		super();
		this.model = model;
		this.varient = varient;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Thar [model=" + model + ", varient=" + varient + ", price=" + price + "]";
	}

}
