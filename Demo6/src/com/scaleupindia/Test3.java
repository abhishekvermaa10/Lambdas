package com.scaleupindia;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Operation operation = (num1, num2) -> num1 > num2;
		boolean result = operation.isGreater(10, 5);
		System.out.println(result);
	}
}