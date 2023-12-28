package com.kh.practice.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	private double pi = 3.141592653589793;
	
	// 원 면적 메소드
	public String calcArea(int x,int y, int radius) {
		
		Circle c = new Circle(x,y,radius);
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
		
		return c.toString()+" / "+(pi*c.getRadius()*c.getRadius())+"";
	}
	
	// 원 둘레 메소드
	public String calcCircum(int x , int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return c.toString()+" / "+(pi*c.getRadius()*2)+"";
	}
	
}
