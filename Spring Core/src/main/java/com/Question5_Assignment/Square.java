package com.Question5_Assignment;

import org.springframework.beans.factory.annotation.Required;

public class Square implements Shape {
	private Point side;

	public Point getSide() {
		return side;
	}
	
//	@Required  uncomment this to check the functionality of @Required
	public void setSide(Point side) {
		this.side = side;
	}

	public void draw() {
		System.out.println("Square point is (" + side.getX() + "," + side.getY() + ")");
	}

}
