package com.victor.practice.simplefactory;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getValue1() * getValue2();
    }
}
