package com.programes.prictice;

public class FunctionalInterfaceUseCaseTestClass {

	public static void main(String[] args) {

		FunctionalInterfaceUseCase fi = (input) -> {
			System.out.println("message: " + input);
		};

		fi.doPrintMessage("Message is private message");

	}

}
