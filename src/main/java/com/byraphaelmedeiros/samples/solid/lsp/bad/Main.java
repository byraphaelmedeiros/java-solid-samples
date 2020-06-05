package com.byraphaelmedeiros.samples.solid.lsp.bad;

import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Main {

	public static void main(String[] args) {
		List<Bird> birds = Arrays.asList(new Crow(), new Ostrich());

		// let the birds flight
		birds.forEach(Bird::fly);
	}

}
