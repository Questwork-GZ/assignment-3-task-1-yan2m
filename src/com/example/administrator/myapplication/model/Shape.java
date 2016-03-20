package com.example.administrator.myapplication.model;

/**
 * Created by Jeremy on 2016/3/2. Mail:jyan.lin@foxmail.com
 */
public abstract class Shape {

	public String shapeName;
	public double a;
	public double b;

	public abstract double calculate(double a, double b);
	
	

	public Shape(double a, double b) {
		this.shapeName = "Shape";
		this.a = a;
		this.b = b;
	}



	public void display() {
		System.out.println("Area of " + getShapeName() + ":" + calculate(a, b));
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
