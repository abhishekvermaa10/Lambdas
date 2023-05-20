package com.scaleupindia;

import java.util.Collections;
import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		List<String> nameList = GeneratorUtil.populateNames(employeeList);

		System.out.println("Sort by name:");
		Collections.sort(nameList, (o1, o2) -> o1.compareTo(o2));
		for (String name : nameList) {
			System.out.println(name);
		}
	}
}