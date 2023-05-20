package com.scaleupindia;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/**
 * @author abhishekvermaa10
 *
 */
public class Test4 {
	public static void main(String[] args) {
		Supplier<LocalDateTime> operation = () -> LocalDateTime.now();
		LocalDateTime result = operation.get();
		System.out.println(result);
	}
}