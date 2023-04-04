package com.scaleupindia;

import java.util.function.BiPredicate;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> operation = (num1, num2) -> num1 > num2;
		boolean result = operation.test(10, 20);
		System.out.println(result);
	}
}