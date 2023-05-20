package com.scaleupindia.service;

/**
 * @author abhishekvermaa10
 *
 */
@FunctionalInterface
public interface Operation {
	int increment(int num); // SAM = Single Abstract Method
}