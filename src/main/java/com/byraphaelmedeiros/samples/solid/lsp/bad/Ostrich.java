package com.byraphaelmedeiros.samples.solid.lsp.bad;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Ostrich extends Bird {

	@Override
	public void fly() {
		throw new UnsupportedOperationException("Ostrich doesn't fly.");
	}

}
