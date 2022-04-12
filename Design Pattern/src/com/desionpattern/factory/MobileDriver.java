package com.desionpattern.factory;

import java.util.Scanner;

public class MobileDriver {

	static int smartphone;
	static Scanner rg = new Scanner(System.in);
	public static Mobile mo;

	public static void main(String[] args) {

		try {
			company().specification();
		} catch (java.lang.IllegalArgumentException e) {
			System.out.println("Choice is Invalied");
		}
	}

	private static Mobile company() {

		System.out.println("select you phone choice 1.Samsung\n 2.redmi\n 3.vivo\n 4.nokia\n");

		int choice = rg.nextInt();

		switch (choice) {
		case 1: {
			mo = new Samsung();
			break;
		}
		case 2: {
			mo = new Nokia();
			break;
		}
		case 3: {
			mo = new Redmi();
			break;
		}
		case 4: {
			mo = new Vivo();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		return null;
	}

}
