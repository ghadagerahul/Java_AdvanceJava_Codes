package com.programes.practice;

public interface FunctionalInterfaceClass {

	public static void doPrintStatic(String input) {
		System.out.println("Message is: " + input);
	}

	abstract void doPrint(String message);

	default void doPrintData(String inpString) {
		System.out.println("Default: " + inpString);
	}

}


