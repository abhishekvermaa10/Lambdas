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
			public void print(int num) {
				System.out.println("You are learning Java - " + num);
			}
		};
		operation.print(17);
	}
}