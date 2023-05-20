package com.scaleupindia;

import java.io.IOException;
import java.util.function.BiFunction;

/**
 * @author abhishekvermaa10
 *
 */
public class Test4 {
	public static void main(String[] args) {
		try {
			BiFunction<Integer, Integer, Integer> operation = (num1, num2) -> {
				try {
					if (num2 == 0) {
						throw new IOException("Cannot divide " + num1 + " by " + num2);
					}
					return num1 / num2;
				} catch (IOException exception) {
					throw new RuntimeException(exception);
				}
			};
			int result = operation.apply(10, 0);
			System.out.println(result);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}