package com.scaleupindia;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Operation operation = num -> num >= 0;
		boolean result = operation.isPositive(10);
		System.out.println(result);
	}
}