package com.task.solidprinciple;

public class Driver {

	public static void main(String[] args) {

		AirLine ar = new AirLine("India0021", "IND0001", 1200);

		Passengers ps = new Passengers("Rahul Ghadage", 22, "9922396598");

		ar.show();
		System.out.println();
		System.out.println();
		ps.display();

		ar.setflightname("NEWINDIA");
		System.out.println(ar.getflightname());

		ar.setflightno("MH1262");
		System.out.println(ar.getflightno());

		System.out.println();
		System.out.println();

		ps.setname("prashant");
		System.out.println(ps.getname());

		ps.setcontact("8766818488");
		System.out.println(ps.getcontact());

		ps.setage(23);
		System.out.println(ps.getage());
	}

}
