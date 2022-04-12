package com.jspiders.designpattern.adaptor;

public class FeatureOfValue {

	static int topspeed;
	static int milage;
	static String color;
	static int airbags;

	public static int getTopspeed() {
		return topspeed;
	}

	public static void setTopspeed(int topspeed) {
		FeatureOfValue.topspeed = topspeed;
	}

	public static int getMilage() {
		return milage;
	}

	public static void setMilage(int milage) {
		FeatureOfValue.milage = milage;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		FeatureOfValue.color = color;
	}

	public static int getAirbags() {
		return airbags;
	}

	public static void setAirbags(int airbags) {
		FeatureOfValue.airbags = airbags;
	}

}
