package com.scaleupindia.service.impl;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class OperationImpl implements Operation {
	@Override
	public void print(int num) {
		System.out.println("You are learning Java " + num);
	}
}