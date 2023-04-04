package com.scaleupindia;

import java.util.function.Function;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Function<Integer, Integer> operation = num -> ++num;
		int result = operation.apply(10);
		System.out.println(result);
	}
}