package com.Question8_Assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("PointA = (" + getPointA().getX() + "," + getPointA().getY() + ")");
		System.out.println("PointB = (" + getPointB().getX() + "," + getPointB().getY() + ")");
		System.out.println("PointC = (" + getPointC().getX() + "," + getPointC().getY() + ")");
	}

	public void destroy() throws Exception {
		System.out.println("Disposable bean destory method called");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean init method called");

	}

	public void Initialize() {
		System.out.println("Initializing bean using init-method");
	}

	public void destroyed() {
		System.out.println("Destory my bean using destroyed-method");
	}

	@PostConstruct
	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : " + message);
	}

	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("Spring Container is destroy! Customer clean up");
	}

}
