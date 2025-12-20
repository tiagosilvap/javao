package com.project.designpatterns.decorator.example1.decorators;

import com.project.designpatterns.decorator.example1.enums.LineStyle;
import com.project.designpatterns.decorator.example1.models.Shape;

public class LineStyleDecorator extends ShapeDecorator {
	protected LineStyle style;

	public LineStyleDecorator(Shape shape, LineStyle style) {
		super(shape);
		this.style = style;
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println("Line Style: " + style);
	}

	// no change in the functionality
	@Override
	public void resize() {
		shape.resize();
	}

	@Override
	public String description() {
		return shape.description() + " drawn with " + style + " lines.";
	}

	// no change in the functionality
	@Override
	public boolean isHide() {
		return shape.isHide();
	}
}