package com.task.solidprinciple;

public class Passengers {

	private String name;
	private int age;
	private String contact;

	public void display() {

		System.out.println("This is the Passesger Details");
		System.out.println("Passesnger name " + name);
		System.out.println("Passesger Age is " + age);
		System.out.println("Contact " + contact);
	}

	public Passengers(String name, int age, String contact) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public String getcontact() {
		return contact;
	}

	public void setcontact(String n) {
		this.contact = contact;
	}

}
