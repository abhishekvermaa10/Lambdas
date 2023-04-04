package com.scaleupindia;

import java.util.function.BiFunction;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> operation = (num1, num2) -> num1 + num2;
		int result = operation.apply(10, 20);
		System.out.println(result);
	}
}