package com.project.designpatterns.decorator.example1.decorators;

import com.project.designpatterns.decorator.example1.models.Shape;

public abstract class ShapeDecorator implements Shape {
	
	protected Shape shape;

	public ShapeDecorator(Shape shape) {
		super();
		this.shape = shape;
	}
}