package com.example.administrator.myapplication.model;

/**
 * Created by Jeremy on 2016/3/3. Mail:jyan.lin@foxmail.com
 */
public class Rectangle extends Shape {

	public Rectangle(double a, double b) {
		super(a, b);
		this.shapeName = "Rectangle";
	}

	@Override
	public double calculate(double a, double b) {
		return a * b;
	}

}
