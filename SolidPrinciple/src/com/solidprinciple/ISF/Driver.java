package com.solidprinciple.ISF;

public class Driver {

	public static void main(String[] args) {

		Lenovo l = new Lenovo();
		System.out.println("-----Details from the Lenovo Class------");
		l.fax();
		l.print();
		l.scan();

		System.out.println();
		System.out.println("--------Details from the Canon class-----------");
		Canon c = new Canon();
		c.fax();
		c.scan();

		System.out.println();
		System.out.println("--------Details from the Hp class-----------");
		Hp h = new Hp();
		h.print();
		h.print();
	}

}
