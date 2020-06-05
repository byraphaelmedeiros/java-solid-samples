package com.byraphaelmedeiros.samples.solid.srp.bad;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class InvoiceService {

	public boolean validateItens(Object invoice) {
		return false;
	}

	public double calculateShipping(Object invoice) {
		return 0d;
	}

	public boolean save(Object invoice) {
		return false;
	}

	public boolean validateInvoiceNumber(long number, Object invoice) {
		return false;
	}

}
