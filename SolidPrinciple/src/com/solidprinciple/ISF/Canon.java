package com.solidprinciple.ISF;

public class Canon implements Scan, Fax {

	@Override
	public void fax() {
		System.out.println(" We can fax from Canon class");

	}

	@Override
	public void scan() {
		System.out.println(" We can Scan from Canon class");

	}

}
