package com.manikarthi25.java8.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierFactory {

	public static void main(String[] args) {

		Employee obj = factory(Employee::new);
		System.out.println(obj);

		Employee obj2 = factory(() -> new Employee("mani"));
		System.out.println(obj2);

	}

	public static Employee factory(Supplier<? extends Employee> s) {

		Employee developer = s.get();
		if (developer.getName() == null || "".equals(developer.getName())) {
			developer.setName("default");
		}
		developer.setSalary(BigDecimal.ONE);
		developer.setStart(LocalDate.of(2017, 8, 8));

		return developer;

	}

}

/*
Employee [name=default, salary=1, start=2017-08-08]
Employee [name=mani, salary=1, start=2017-08-08]
*/