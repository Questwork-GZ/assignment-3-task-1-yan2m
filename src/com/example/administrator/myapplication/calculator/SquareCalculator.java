package com.example.administrator.myapplication.calculator;

import com.example.administrator.myapplication.Interface.AreaCalculator;

/**
 * Created by Jeremy on 2016/3/2.
 * Mail:jyan.lin@foxmail.com
 */
public class SquareCalculator implements AreaCalculator {
    @Override
    public double calculator() {
        return 4*4;
    }
}
