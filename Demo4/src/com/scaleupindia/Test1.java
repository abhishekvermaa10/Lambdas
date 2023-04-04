package com.scaleupindia;

import java.time.LocalDateTime;

import com.scaleupindia.service.Operation;
import com.scaleupindia.service.impl.OperationImpl;

/**
 * @author abhishekvermaa10
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Operation operation = new OperationImpl();
		LocalDateTime result = operation.generate();
		System.out.println(result);
	}
}