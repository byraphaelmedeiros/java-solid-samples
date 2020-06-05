package com.byraphaelmedeiros.samples.solid.isp.bad;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Robot implements Worker {

	@Override
	public void work() {
		System.out.println("Working...");
	}

	@Override
	public void eat() {
		throw new UnsupportedOperationException("Robots doesn't eat.");
	}

}
