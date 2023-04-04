package com.scaleupindia.service.impl;

import java.time.LocalDateTime;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class OperationImpl implements Operation {
	@Override
	public LocalDateTime generate() {
		return LocalDateTime.now();
	}
}