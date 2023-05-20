package com.scaleupindia;

import java.util.Collections;
import java.util.Comparator;
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

		System.out.println("Sort by name:");
		Collections.sort(employeeList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return CustomComparator.compareByName(o1, o2);
			}
		});
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		System.out.println("Sort by marks:");
		Collections.sort(employeeList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return CustomComparator.compareByMarks(o1, o2);
			}
		});
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}