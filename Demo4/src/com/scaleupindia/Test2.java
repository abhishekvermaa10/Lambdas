package com.scaleupindia;

import java.time.LocalDateTime;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Operation operation = new Operation(){
			@Override
			public LocalDateTime generate() {
				return LocalDateTime.now();
			}
		};
		LocalDateTime result = operation.generate();
		System.out.println(result);
	}
}