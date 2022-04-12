package com.jspiders.designpattern.adaptor;

public class Lamborgini extends FeatureOfValue implements FeaturesOfCar {

	@Override
	public void topspeed() {
		setTopspeed(300);
		System.out.println("topspeed is " + getTopspeed());

	}

	@Override
	public void milage() {
		setMilage(5);
		System.out.println("milagee is " + getMilage());
	}

	@Override
	public void color() {
		setColor("red");
		System.out.println("color is the " + getColor());
	}

	@Override
	public void airbags() {
		setAirbags(8);
		System.out.println("there are " + getAirbags() + " airbags");

	}

}
