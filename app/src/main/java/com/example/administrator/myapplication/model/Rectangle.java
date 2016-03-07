package com.example.administrator.myapplication.model;

import com.example.administrator.myapplication.calculator.RectangleCalculator;

/**
 * Created by Jeremy on 2016/3/3.
 * Mail:jyan.lin@foxmail.com
 */
public class Rectangle extends Shape {

//    public Rectangle() {
//        areaCalculator = new RectangleCalculator();
//    }

    @Override
    public double calculate(double a, double b) {
        return a*b;
    }

    @Override
    public void display() {
        System.out.println("Area of Rectangle : " + calculate(8,4));
    }
}
