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
			public boolean isPositive(int num) {
				return num >= 0;
			}
		};
		boolean result = operation.isPositive(10);
		System.out.println(result);
	}
}