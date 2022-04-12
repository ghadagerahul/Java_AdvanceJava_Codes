package com.designpattern.builder.Task;

public class TharMain {

	public static void main(String[] args) {

		Thar thar = new TharBuilder().model("newmodel").varient("topvarient").price(1400000).build();

		System.out.println(thar);
	}

}
