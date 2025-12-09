package com.programes.practice;

@FunctionalInterface
interface FuncInterface {

	abstract void DosimePrint(String msg);

	default void doDefaultPrint() {
		System.out.println("Default Print");
	}

	static void doStaticPrint() {
		System.out.println("Static Print");
	}

}
