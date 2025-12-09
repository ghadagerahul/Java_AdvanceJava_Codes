package com.programes.prictice;

public class SingleToneClass {

	private static SingleToneClass SingleToneClass;

	private SingleToneClass() {

	}

	public SingleToneClass getSingleTomeClass() {

		synchronized (SingleToneClass) {

			SingleToneClass = new SingleToneClass();

		}
		{

		}

		return SingleToneClass;

	}

}
