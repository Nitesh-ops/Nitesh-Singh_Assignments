package com.Question5_Assignment;

import javax.annotation.Resource;

public class Circle implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle point is (" + center.getX() + "," + center.getY() + ")");
	}

}
