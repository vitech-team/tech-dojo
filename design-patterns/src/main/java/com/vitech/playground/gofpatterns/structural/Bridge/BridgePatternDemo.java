package com.vitech.playground.gofpatterns.structural.Bridge;

import com.vitech.playground.gofpatterns.structural.Bridge.color.impl.Blue;
import com.vitech.playground.gofpatterns.structural.Bridge.color.impl.Green;
import com.vitech.playground.gofpatterns.structural.Bridge.color.impl.Red;
import com.vitech.playground.gofpatterns.structural.Bridge.shape.Shape;
import com.vitech.playground.gofpatterns.structural.Bridge.shape.impl.Circle;
import com.vitech.playground.gofpatterns.structural.Bridge.shape.impl.Square;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(6.35, new Red());
		redCircle.draw();
		Shape greenCircle = new Circle(6.35,  new Green());
		greenCircle.draw();
		Shape blueCircle = new Circle(6.35,  new Blue());
		blueCircle.draw();

		Shape redSquare = new Square(6.35, new Red());
		redSquare.draw();
		Shape greenSquare = new Square(6.35,  new Green());
		greenSquare.draw();
		Shape blueSquare = new Square(6.35,  new Blue());
		blueSquare.draw();
	}
}


