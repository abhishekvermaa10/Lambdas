package com.scaleupindia.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author abhishekvermaa10
 *
 */
public class GeneratorUtil {
	public static <E> List<E> populateEmployees(int length, Supplier<E> supplier) {
		List<E> employeeList = new ArrayList<>();
		for (int i = 0; i < length; i++)
			employeeList.add(supplier.get());
		return employeeList;
	}
}