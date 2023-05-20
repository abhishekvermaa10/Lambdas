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
public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();

		System.out.println("Sort by name:");
		Collections.sort(employeeList, (o1, o2) -> CustomComparator.compareByName(o1, o2));
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		System.out.println("Sort by marks:");
		Collections.sort(employeeList, (o1, o2) -> CustomComparator.compareByMarks(o1, o2));
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}