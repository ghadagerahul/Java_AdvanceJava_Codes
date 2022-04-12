package com.solidprinciple.ISF;

public class Lenovo implements Scan, Print, Fax {

	@Override
	public void fax() {
		System.out.println("We can fax from Lenovo class");

	}

	@Override
	public void print() {
		System.out.println("We can prit from Lenovo class");

	}

	@Override
	public void scan() {
		System.out.println("We can Scan from Lenovo class");

	}

}
