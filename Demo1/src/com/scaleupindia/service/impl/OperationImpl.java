package com.scaleupindia.service.impl;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class OperationImpl implements Operation {
	@Override
	public int increment(int num) {
		return ++num;
	}
}