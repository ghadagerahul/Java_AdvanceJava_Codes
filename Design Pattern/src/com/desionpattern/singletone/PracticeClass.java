package com.desionpattern.singletone;

public class PracticeClass {

	private static PracticeClass pc;
	static int flag;

	private PracticeClass() {
		System.out.println("Object creation is sucessfull...!!!! count is the:" + flag);
	}

	public static PracticeClass getPracticeClass() {

		if (pc == null) {
			flag++;
			pc = new PracticeClass();
			System.out.println("work is done");
			return pc;
		}
		System.out.println("work done");
		return pc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeClass.getPracticeClass();
	}

}
