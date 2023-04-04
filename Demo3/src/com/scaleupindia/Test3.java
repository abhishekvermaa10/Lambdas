package com.scaleupindia;

import java.util.function.Consumer;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Consumer<Integer> operation = num -> System.out.println("You are learning Java " + num);
		operation.accept(17);
	}
}