package com.javaex.ex04;

public abstract class Shape {
    
	//필드
	protected int countSides;
	
	//생성자
	public Shape() {
		super();
	}
	
	public Shape(int countSides) {
		this.countSides = countSides;
	}
	
	//메서드 gs
	public int getCountSides() {
			return countSides;
	}

	public void setCountSides(int countSides) {
			this.countSides = countSides;
	}
	
    
    
	//메서드 일반
	
	public abstract double getArea(); // 넓이

	public abstract double getPerimeter(); // 둘레 길이

	@Override
	public String toString() {
		return "Shape [countSides=" + countSides + "]";
	}
	
	
    
	
    
}
