package com.byraphaelmedeiros.samples.solid.dip.good;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Copier {

	public void copy(Writer writer) {
		String message = null;

		if (message != null && !message.equalsIgnoreCase("q")) {
			message = System.console().readLine();

			writer.write(message);
		}
	}

}
