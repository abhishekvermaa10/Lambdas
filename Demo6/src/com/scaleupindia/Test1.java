package com.scaleupindia;

import com.scaleupindia.service.Operation;
import com.scaleupindia.service.impl.OperationImpl;

/**
 * @author abhishekvermaa10
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Operation operation = new OperationImpl();
		boolean result = operation.isGreater(10, 5);
		System.out.println(result);
	}
}