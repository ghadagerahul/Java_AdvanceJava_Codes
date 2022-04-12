package com.solidprinciple.ISF;

public class Hp implements Scan, Print {

	@Override
	public void print() {
		System.out.println("We cane print from hp class");

	}

	@Override
	public void scan() {
		System.out.println("We can scan from hp class");

	}

}
