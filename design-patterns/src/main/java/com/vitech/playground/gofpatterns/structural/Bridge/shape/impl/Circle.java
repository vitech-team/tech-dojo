package com.vitech.playground.gofpatterns.structural.Bridge.shape.impl;

import com.vitech.playground.gofpatterns.structural.Bridge.color.Color;
import com.vitech.playground.gofpatterns.structural.Bridge.shape.Shape;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius, Color color) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.print("The circle with a ");
		color.fill();
	}
}
