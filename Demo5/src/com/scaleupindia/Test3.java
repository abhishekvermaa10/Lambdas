package com.scaleupindia;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Operation operation = (num1, num2) -> num1 / num2;
		int result = operation.divide(10, 5);
		System.out.println(result);
	}
}