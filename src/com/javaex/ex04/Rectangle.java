package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
    
	//필드
	private double width;
    private double height;

    //생성자
    public Rectangle() {
    	super();
    }
    
    public Rectangle(double width, double height) {
    	this.width = width;
    	this.height = height;
    }
    
    public Rectangle(double width, double height, int countSides) {
    	super(countSides);
    	this.width = width;
    	this.height = height;
    }
    
    
    
    //메서드 gs

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

    
    //메서드 일반
	public  double getArea() {		//넓이
		return width * height;
	}
	
	public  double getPerimeter() {		//둘레길이
		return (width + height)*2;
	}
	
	 public void resize(double s) {
		 width = width*s;
		 height = height*s;
		 
		 
	 }
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
    
}