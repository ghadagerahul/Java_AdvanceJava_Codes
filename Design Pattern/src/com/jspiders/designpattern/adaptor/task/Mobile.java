package com.jspiders.designpattern.adaptor.task;

public class Mobile extends DemandingValues implements DemandingMobilphone {

	@Override
	public void model() {
		setModel("Note 5 pro");
		System.out.println("The model of phone is :" + getModel());

	}

	@Override
	public void price() {
		setPrice(16000.00);
		System.out.println("price of mobile is : " + getPrice());

	}

	@Override
	public void resellvalue() {
		setResellvalue(11000.00);
		System.out.println("resell value is :" + getResellvalue());

	}

	@Override
	public void availability() {
		setAvailability(true);

	}

	@Override
	public void camera() {
		setCamera(20);
		System.out.println("camera of phone is : " + getCamera());

	}

}
