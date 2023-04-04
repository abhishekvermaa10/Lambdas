package com.scaleupindia;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Operation operation = (num1, num2) -> num1 + num2;
		int result = operation.add(10, 20);
		System.out.println(result);
	}
}