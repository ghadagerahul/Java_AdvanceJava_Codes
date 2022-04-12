package com.designpattern.builder;

public class Builder {

	String model;
	String brand;
	int ram;
	int rom;
	String processor;
	int batary;
	int frontcam;
	int rearcam;
	double price;
	String color;
	boolean fingerprint;

	public Builder model(String model) {
		this.model = model;
		return this;
	}

	public Builder brand(String brand) {
		this.brand = brand;
		return this;
	}

	public Builder ram(int ram) {
		this.ram = ram;
		return this;
	}

	public Builder model(int rom) {
		this.rom = rom;
		return this;
	}

	public Builder processor(String processor) {
		this.processor = processor;
		return this;
	}

	public Builder battary(int batary) {
		this.batary = batary;
		return this;
	}

	public Builder frontcam(int frontcam) {
		this.frontcam = frontcam;
		return this;
	}

	public Builder price(double price) {
		this.price = price;
		return this;
	}

	public Builder color(String color) {
		this.color = color;
		return this;
	}

	public Builder fingerprint(boolean fingerprint) {
		this.fingerprint = fingerprint;
		return this;
	}

	public Mobile build() {

		Mobile mobile = new Mobile(this.brand, this.model, this.ram, this.rom, this.processor, this.batary,
				this.rearcam, this.frontcam, this.price, this.color, this.fingerprint);
		return mobile;

	}

}
