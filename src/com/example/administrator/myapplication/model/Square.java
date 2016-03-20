package com.example.administrator.myapplication.model;


/**
 * Created by Jeremy on 2016/3/3.
 * Mail:jyan.lin@foxmail.com
 */
public class Square extends Shape {



    public Square(double a, double b) {
		super(a, b);
		this.shapeName = "Square";
	}

	@Override
    public double calculate(double a, double b) {
        return a*a;
    }

}
