package com.project.designpatterns.decorator.example1;

import com.project.designpatterns.decorator.example1.decorators.FillColorDecorator;
import com.project.designpatterns.decorator.example1.decorators.LineColorDecorator;
import com.project.designpatterns.decorator.example1.decorators.LineStyleDecorator;
import com.project.designpatterns.decorator.example1.decorators.LineThinknessDecorator;
import com.project.designpatterns.decorator.example1.enums.Color;
import com.project.designpatterns.decorator.example1.enums.LineStyle;
import com.project.designpatterns.decorator.example1.models.Circle;
import com.project.designpatterns.decorator.example1.models.Rectangle;
import com.project.designpatterns.decorator.example1.models.Shape;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Creating Simple Shape Objects...");
		Shape rectangle = new Rectangle();
		rectangle.draw();
		System.out.println();
	
		Shape circle = new Circle();
		System.out.println("Drawing Simple Shape Objects...");
		circle.draw();
		System.out.println();
		
		System.out.println("Creating Decorated Circle with Red Color, Blue Lines in dash pattern and thickness of 2 ...");
		Shape circle1 = new FillColorDecorator(new LineColorDecorator(
				new LineStyleDecorator(new LineThinknessDecorator(new Circle(), 2.0d), LineStyle.DASH), Color.BLUE),
				Color.RED);
		circle1.draw();
		System.out.println();
		

		System.out.println("creating object with similar functionalities in separate statements.");
		Circle c = new Circle();
		LineThinknessDecorator lt = new LineThinknessDecorator(c, 2.0d);
		LineStyleDecorator ls = new LineStyleDecorator(lt, LineStyle.DASH);
		LineColorDecorator lc = new LineColorDecorator(ls, Color.BLUE);
		FillColorDecorator fc = new FillColorDecorator(lc, Color.RED);
		Shape circle3 = fc;
		circle3.draw();
		System.out.println();
		
		System.out.println("Creating Decorated Circle with Green Color, Black Lines ...");
		Shape circle2 = new FillColorDecorator(new LineColorDecorator(new Circle(), Color.BLACK), Color.GREEN);
		circle2.draw();
		System.out.println();
		
		System.out.println("Creating Decorated Rectange with Yellow Color, Red Lines in double dash pattern...");
		Shape rectangle1 = new FillColorDecorator(new LineColorDecorator(new Rectangle(), Color.RED), Color.YELLOW);
		rectangle1.draw();
		System.out.println();
	}
}