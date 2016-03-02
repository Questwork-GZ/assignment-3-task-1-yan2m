package com.example.administrator.myapplication.model;

import com.example.administrator.myapplication.calculator.SquareCalculator;

/**
 * Created by Jeremy on 2016/3/3.
 * Mail:jyan.lin@foxmail.com
 */
public class Square extends Shape {
    private double result;

    public Square() {
        areaCalculator = new SquareCalculator();
    }

    @Override
    public void display() {
        System.out.println("Area of square : " + areaCalculator.calculator());
    }
}
