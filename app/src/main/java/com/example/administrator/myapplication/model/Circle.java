package com.example.administrator.myapplication.model;

import com.example.administrator.myapplication.calculator.CircleCalculator;

/**
 * Created by Jeremy on 2016/3/3.
 * Mail:jyan.lin@foxmail.com
 */
public class Circle extends Shape {

    public Circle() {
        areaCalculator = new CircleCalculator();
    }

    @Override
    public void display() {
        System.out.println("Area of Circle : " + areaCalculator.calculator());
    }
}
