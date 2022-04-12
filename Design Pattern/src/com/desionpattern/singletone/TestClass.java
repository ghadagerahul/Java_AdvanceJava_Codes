package com.desionpattern.singletone;

class TestClass {

	private static TestClass test;
	static int count;

	private TestClass() {
		System.out.println("object is created");
	}

	public static TestClass getTestClass() {
		if (test == null) {
			test = new TestClass();
			return test;
		}
		return test;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass.getTestClass();
		TestClass.getTestClass();
		TestClass.getTestClass();
	}
}
