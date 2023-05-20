package com.scaleupindia;

import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees(10, Employee::new);

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}