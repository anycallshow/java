package com.kh.practice.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle(); 
	
	// 면적 메소드
	public String calcArea(int x, int y, int height,int width) {
//		Rectangle r = new Rectangle(x,y,height,width);
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return r.toString() +" / "+ (r.getHeight() * r.getWidth());
	}
	
	// 둘레 메소드
	public String calcPerimeter(int x,int y, int height,int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return r.toString() +" / "+(2*(r.getHeight()+r.getWidth()));
		
	}
	
}
