package com.byraphaelmedeiros.samples.solid.dip.bad;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class Copier {

	public void copy(boolean isToClipboard) {
		String message = null;

		if (message != null && !message.equalsIgnoreCase("q")) {
			message = System.console().readLine();

			if (isToClipboard) {
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				StringSelection selection = new StringSelection(message);
				clipboard.setContents(selection, null);
			}
			else {
				System.out.println(message);
			}
		}
	}

}
