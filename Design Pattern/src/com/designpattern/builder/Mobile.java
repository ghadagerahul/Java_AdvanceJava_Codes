package com.designpattern.builder;

public class Mobile {

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

	public Mobile(String model, String brand, int ram, int rom, String processor, int batary, int frontcam, int rearcam,
			double price, String color, boolean fingerprint) {
		super();
		this.model = model;
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.batary = batary;
		this.frontcam = frontcam;
		this.rearcam = rearcam;
		this.price = price;
		this.color = color;
		this.fingerprint = fingerprint;
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", ram=" + ram + ", rom=" + rom + ", processor="
				+ processor + ", batary=" + batary + ", frontcam=" + frontcam + ", rearcam=" + rearcam + ", price="
				+ price + ", color=" + color + ", fingerprint=" + fingerprint + "]";
	}
	
	

}
