package com.byraphaelmedeiros.samples.solid.isp.bad;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Employee implements Worker {

	@Override
	public void work() {
		System.out.println("Working...");
	}

	@Override
	public void eat() {
		System.out.println("Eating...");
	}

}
