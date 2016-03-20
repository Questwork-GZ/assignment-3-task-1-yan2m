package com.example.administrator.myapplication.model;


/**
 * Created by Jeremy on 2016/3/3.
 * Mail:jyan.lin@foxmail.com
 */
public class Circle extends Shape {



    public Circle(double a, double b) {
		super(a, b);
		this.shapeName = "Circle";
	}

	@Override
    public double calculate(double a, double b) {
        return a*a*Math.PI;
    }

}
