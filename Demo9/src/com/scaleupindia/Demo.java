package com.scaleupindia;

import java.util.Collections;
import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.CustomComparator;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		CustomComparator customComparator = new CustomComparator();

		Collections.sort(employeeList, (employee1, employee2) -> customComparator.compareByName(employee1, employee2));
		System.out.println("Sort by name:");
		employeeList.forEach(employee -> System.out.println(employee));

		Collections.sort(employeeList, (employee1, employee2) -> customComparator.compareByMarks(employee1, employee2));
		System.out.println("Sort by age:");
		employeeList.forEach(employee -> System.out.println(employee));
	}
}