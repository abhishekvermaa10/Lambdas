package com.scaleupindia;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Operation operation = new Operation() {
			@Override
			public int divide(int num1, int num2) {
				return num1 / num2;
			}
		};
		int result = operation.divide(10, 5);
		System.out.println(result);
	}
}