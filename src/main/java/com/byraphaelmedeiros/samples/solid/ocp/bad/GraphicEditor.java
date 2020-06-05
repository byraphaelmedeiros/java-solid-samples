package com.byraphaelmedeiros.samples.solid.ocp.bad;

/**
 * @author Raphael Medeiros (raphael.medeiros@gmail.com)
 * @since 05/06/2020
 */
public class GraphicEditor {

	public void draw(Shape shape) {
		if (shape instanceof Square) {
			drawSquare();
		}
		else if (shape instanceof Circle) {
			drawCircle();
		}
	}

	private void drawCircle() {
		System.out.println("Circle!");
	}

	private void drawSquare() {
		System.out.println("Square!");
	}

}
