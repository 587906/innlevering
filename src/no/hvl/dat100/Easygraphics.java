package no.hvl.dat100;

import easygraphics.*;

public class Easygraphics extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Grafikk", 350, 350);
		drawCircle(150, 60, 60);
		drawCircle(150, 180, 60);
	
	}
}