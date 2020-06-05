package com.byraphaelmedeiros.samples.solid.isp.good;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Employee implements Workable, Feedable {

	@Override
	public void work() {
		System.out.println("Working...");
	}

	@Override
	public void eat() {
		System.out.println("Eating...");
	}

}
