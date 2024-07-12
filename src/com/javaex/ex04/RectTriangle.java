package com.javaex.ex04;

public class RectTriangle extends Shape{
   
	//필드
	private double width;
    private double height;

    //생성자
    public RectTriangle() {
    	super();
    }
    public RectTriangle(double width, double height) {
    	this.width = width;
    	this.height = height;
    }
    
    
    public RectTriangle(double width, double heighth,int countSides) {
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
	
	public double getArea() {		// 넓이
		return (width * height)/2;
	}
	
	public double getPerimeter() {		//둘레길이
		return width + height+(Math.sqrt(width*width+height*height));
	}
	
    //메서드 일반

	
	
	@Override
	public String toString() {
		return "RectTriangle [width=" + width + ", height=" + height + "]";
	}
	
	
    
    
}