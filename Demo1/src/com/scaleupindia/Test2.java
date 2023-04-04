package com.scaleupindia;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Operation operation = num -> ++num;
		int result = operation.increment(10);
		System.out.println(result);
	}
}