package com.scaleupindia;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Operation operation = num -> System.out.println("You are learning Java - " + num);
		operation.print(17);
	}
}