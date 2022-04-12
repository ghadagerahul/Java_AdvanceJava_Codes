package com.designpattern.builder;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile = new Builder().model("12pro").battary(4).build();

		System.out.println(mobile);
	}
}
