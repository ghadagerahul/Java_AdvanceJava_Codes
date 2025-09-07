package com.programes.questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeNameSalary {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList();

		emp.add(new Employee("rahul", 1450000));
		emp.add(new Employee("ramesh", 750000));
		emp.add(new Employee("amol", 1200000));
		emp.add(new Employee("prashant", 19000000));
		emp.add(new Employee("prashant", 18000000));

		ArrayList<Employee> collect = emp.stream().sorted(
				Comparator.comparing(Employee::getName).reversed().thenComparing(Employee::getSalary).reversed())
				.collect(Collectors.toCollection(ArrayList::new));

		collect.stream().forEach(System.out::println);

	}

}

class Employee {

	private String name;
	private long salary;

	public Employee(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
