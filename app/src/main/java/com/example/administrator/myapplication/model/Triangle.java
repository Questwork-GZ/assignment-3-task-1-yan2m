package com.example.administrator.myapplication.model;

import com.example.administrator.myapplication.calculator.TriangleCalculator;

/**
 * Created by Jeremy on 2016/3/3.
 * Mail:jyan.lin@foxmail.com
 */
public class Triangle extends Shape {

    private double a;
    private double b;
//    public Triangle() {
//        areaCalculator = new TriangleCalculator();
//    }


    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double a, double b) {
        return 0.5 * a * b;
    }

    @Override
    public void display() {
        System.out.println("Area of Triangle : " + calculate(a, b));
    }
}
