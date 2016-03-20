package com.example.administrator.myapplication.model;


/**
 * Created by Jeremy on 2016/3/3.
 * Mail:jyan.lin@foxmail.com
 */
public class Triangle extends Shape {


    public Triangle(double a, double b) {
    	super(a, b);
    	this.shapeName = "Triangle";
    }

    @Override
    public double calculate(double a, double b) {
        return 0.5 * a * b;
    }

}
