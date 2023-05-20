package com.scaleupindia;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		// Create an object of Operation
		Operation operation = num -> ++num;  //Lambda Expression
		// invoke increment method and save output in result variable
		int result = operation.increment(10);
		// print result variable
		System.out.println(result);
	}
}