package com.scaleupindia;

import com.scaleupindia.service.Operation;
import com.scaleupindia.service.impl.OperationImpl;

/**
 * @author abhishekvermaa10
 *
 */
public class Test1 {
	public static void main(String[] args) {
		// Create an object of Operation
		Operation operation = new OperationImpl();
		// invoke increment method and save output in result variable
		int result = operation.increment(10);
		// print result variable
		System.out.println(result);
	}
}