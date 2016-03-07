package com.example.administrator.myapplication.model;

import com.example.administrator.myapplication.calculator.CircleCalculator;

/**
 * Created by Jeremy on 2016/3/3.
 * Mail:jyan.lin@foxmail.com
 */
public class Circle extends Shape {

    private double a;
//    public Circle() {
//        areaCalculator = new CircleCalculator();
//    }

    public Circle(double a) {
        this.a = a;
    }

    @Override
    public double calculate(double a, double b) {
        return a*a*Math.PI;
    }

    @Override
    public void display() {
        System.out.println("Area of Circle : " + calculate(a,a));
    }
}
