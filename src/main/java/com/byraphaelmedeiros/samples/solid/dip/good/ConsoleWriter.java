package com.byraphaelmedeiros.samples.solid.dip.good;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class ConsoleWriter implements Writer {

	@Override
	public void write(String message) {
		System.out.println(message);
	}

}
