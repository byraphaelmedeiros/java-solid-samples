package com.byraphaelmedeiros.samples.solid.lsp.good;

import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Main {

	public static void main(String[] args) {
		// Flying Birds
		List<FlyingBird> flyingBirds = Arrays.asList(new Crow());

		// let the birds flight
		flyingBirds.forEach(FlyingBird::fly);

		// All Birds
		List<Bird> birds = Arrays.asList(new Crow(), new Ostrich());

		// let the birds eat
		birds.forEach(Bird::eat);
	}

}
