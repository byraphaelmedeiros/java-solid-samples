package com.byraphaelmedeiros.samples.solid.isp.good;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Manager {

	private final Workable workable;

	public Manager(Workable workable) {
		this.workable = workable;
	}

	public void startWorking() {
		this.workable.work();
	}

}
