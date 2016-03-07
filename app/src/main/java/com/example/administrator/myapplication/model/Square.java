package com.example.administrator.myapplication.model;

import com.example.administrator.myapplication.calculator.SquareCalculator;

/**
 * Created by Jeremy on 2016/3/3.
 * Mail:jyan.lin@foxmail.com
 */
public class Square extends Shape {
    private double a;

//    public Square() {
//        areaCalculator = new SquareCalculator();
//    }


    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculate(double a, double b) {
        return a*a;
    }

    @Override
    public void display() {
        System.out.println("Area of square : " + calculate(a,a));
    }
}
