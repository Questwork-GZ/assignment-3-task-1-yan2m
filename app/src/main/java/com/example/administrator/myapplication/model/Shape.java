package com.example.administrator.myapplication.model;

import com.example.administrator.myapplication.Interface.AreaCalculator;

/**
 * Created by Jeremy on 2016/3/2.
 * Mail:jyan.lin@foxmail.com
 */
public abstract class Shape {
    AreaCalculator areaCalculator;

    public void calculate() {
        areaCalculator.calculator();
    }

    public abstract void display();
}
