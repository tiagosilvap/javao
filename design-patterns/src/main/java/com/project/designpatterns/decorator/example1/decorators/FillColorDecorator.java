package com.project.designpatterns.decorator.example1.decorators;

import com.project.designpatterns.decorator.example1.enums.Color;
import com.project.designpatterns.decorator.example1.models.Shape;

public class FillColorDecorator extends ShapeDecorator {
	
	protected Color color;

	public FillColorDecorator(Shape shape, Color color) {
		super(shape);
		this.color = color;
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println("Fill Color: " + color);
	}

	// no change in the functionality
	// we can add in the functionality if we like. there is no restriction
	// except we need to maintain the structure of the Shape APIs
	@Override
	public void resize() {
		shape.resize();
	}

	@Override
	public String description() {
		return shape.description() + " filled with " + color + " color.";
	}

	// no change in the functionality
	@Override
	public boolean isHide() {
		return shape.isHide();
	}
}
