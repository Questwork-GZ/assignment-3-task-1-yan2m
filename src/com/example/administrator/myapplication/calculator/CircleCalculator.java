package com.example.administrator.myapplication.calculator;

import com.example.administrator.myapplication.Interface.AreaCalculator;

/**
 * Created by Jeremy on 2016/3/2.
 * Mail:jyan.lin@foxmail.com
 */
public class CircleCalculator implements AreaCalculator {
    @Override
    public double calculator() {
        //a : r, b : pie
        return 4*4*3.14;
    }
}
