package com.byraphaelmedeiros.samples.solid.dip.good;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Main {

	public static void main(String[] args) {
		Copier copier = new Copier();

		copier.copy(new ConsoleWriter());
		copier.copy(new ClipboardWriter());
	}

}
