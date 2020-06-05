package com.byraphaelmedeiros.samples.solid.isp.bad;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Manager {

	private final Worker worker;

	public Manager(Worker worker) {
		this.worker = worker;
	}

	public void startWorking() {
		this.worker.work();
	}

}
