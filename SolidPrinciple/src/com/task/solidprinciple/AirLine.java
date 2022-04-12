package com.task.solidprinciple;

public class AirLine {

	private String flightname;
	private String flightno;
	private int capacity;
	
	
	public void show() {
		
		System.out.println("Details of the Flight");
		System.out.println("Flight name is "+ flightname);
		System.out.println("Flight number is "+ flightno);
		System.out.println("Flight capacity "+capacity);
	}
	
	public AirLine(String flightname, String flightno, int capacity) {
		super();
		this.flightname = flightname;
		this.flightno = flightno;
		this.capacity = capacity;
	}

	
	public String getflightname() 
	{
		return flightname;
	}
	
	
	public void setflightname(String name)
	{
		this.flightname=name;
	}
	
	public String getflightno()
	{
		return flightno;
	}

	public void setflightno(String no)
	{
		this.flightno=no;
	}
	
	
	
}
