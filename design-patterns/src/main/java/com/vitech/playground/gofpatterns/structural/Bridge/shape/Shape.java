package com.vitech.playground.gofpatterns.structural.Bridge.shape;


import com.vitech.playground.gofpatterns.structural.Bridge.color.Color;

public abstract class Shape {
	protected Color color;
	public Shape(Color color) {
		this.color = color;
	}
	public abstract void draw();
}
