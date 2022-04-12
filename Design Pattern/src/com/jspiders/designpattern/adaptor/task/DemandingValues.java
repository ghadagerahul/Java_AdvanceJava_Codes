package com.jspiders.designpattern.adaptor.task;

public class DemandingValues {

	static String model;
	static double price;
	static double resellvalue;
	static boolean availability;
	static int camera;

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		DemandingValues.model = model;
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		DemandingValues.price = price;
	}

	public static double getResellvalue() {
		return resellvalue;
	}

	public static void setResellvalue(double resellvalue) {
		DemandingValues.resellvalue = resellvalue;
	}

	public static boolean isAvailability() {
		return availability;
	}

	public static void setAvailability(boolean availability) {
		DemandingValues.availability = availability;
	}

	public static int getCamera() {
		return camera;
	}

	public static void setCamera(int camera) {
		DemandingValues.camera = camera;
	}

}
