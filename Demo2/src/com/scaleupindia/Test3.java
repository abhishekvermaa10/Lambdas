package com.scaleupindia;

import java.util.function.Predicate;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Predicate<Integer> operation = num -> num > 0;
		boolean result = operation.test(10);
		System.out.println(result);
	}
}