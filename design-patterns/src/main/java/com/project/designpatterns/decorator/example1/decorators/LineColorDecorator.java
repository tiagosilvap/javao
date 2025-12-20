package com.project.designpatterns.decorator.example1.decorators;

import com.project.designpatterns.decorator.example1.enums.Color;
import com.project.designpatterns.decorator.example1.models.Shape;

public class LineColorDecorator extends ShapeDecorator {
	protected Color color;

	public LineColorDecorator(Shape shape, Color color) {
		super(shape);
		this.color = color;
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println("Line Color: " + color);
	}

	// no change in the functionality
	@Override
	public void resize() {
		shape.resize();
	}

	@Override
	public String description() {
		return shape.description() + " drawn with " + color + " color.";
	}

	// no change in the functionality
	@Override
	public boolean isHide() {
		return shape.isHide();
	}
}