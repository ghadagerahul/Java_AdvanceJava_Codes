package com.solidprinciple.Liskov;

public class Driver {

	public static void main(String[] args) {

		Sparrow s = new Sparrow();
		s.fly();
		System.out.println();

		Parrot p = new Parrot();
		p.fly();
		System.out.println();

		Ostrich o = new Ostrich();
		o.survive();
	}
}
