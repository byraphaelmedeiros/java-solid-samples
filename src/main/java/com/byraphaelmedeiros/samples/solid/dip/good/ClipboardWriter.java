package com.byraphaelmedeiros.samples.solid.dip.good;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class ClipboardWriter implements Writer {

	@Override
	public void write(String message) {
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection selection = new StringSelection(message);
		clipboard.setContents(selection, null);
	}

}
