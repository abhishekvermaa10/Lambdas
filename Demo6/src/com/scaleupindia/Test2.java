package com.scaleupindia;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Operation operation = new Operation(){
			@Override
			public boolean isGreater(int num1, int num2) {
				return num1 > num2;
			}
		};
		boolean result = operation.isGreater(10, 5);
		System.out.println(result);
	}
}