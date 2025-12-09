package com.programes.practice;

public class TestClass {

	public static void main(String[] args) {

		String input = "do some study";

		FunctionalInterfaceClass fi = (input1) -> {
			System.out.println(input1);
		};

		fi.doPrint(input);

		fi.doPrintData(input);

		FuncInterface fs = (mms) -> {
			System.out.println("Message: " + mms);
		};

		fs.doDefaultPrint();
		fs.DosimePrint(input);
		FuncInterface.doStaticPrint();

	}
}
