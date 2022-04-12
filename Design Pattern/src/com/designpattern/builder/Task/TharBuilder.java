package com.designpattern.builder.Task;

public class TharBuilder {

	String model;
	String varient;
	double price;

	public TharBuilder model(String model) {
		this.model = model;
		return this;
	}

	public TharBuilder varient(String varient) {
		this.varient = varient;
		return this;
	}

	public TharBuilder price(double price) {
		this.price = price;
		return this;
	}

	public Thar build() {
		Thar thar = new Thar(this.model, this.varient, this.price);
		return thar;
	}

}
