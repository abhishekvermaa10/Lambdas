package com.scaleupindia;

import com.scaleupindia.service.Operation;
import com.scaleupindia.service.impl.OperationImpl;

/**
 * @author abhishekvermaa10
 *
 */
public class Test1 {
	public static void main(String[] args) {
		try {
			Operation operation = new OperationImpl();
			int result = operation.divide(10, 0);
			System.out.println(result);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}