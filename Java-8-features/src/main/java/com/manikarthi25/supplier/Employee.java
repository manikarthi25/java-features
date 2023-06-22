package com.manikarthi25.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	String name;
	BigDecimal salary;
	LocalDate start;

	// for factory(Developer::new);
	public Employee() {
	}

	// for factory(() -> new Developer("mani"));
	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", start=" + start + "]";
	}

}
