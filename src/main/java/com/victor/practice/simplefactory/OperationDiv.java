package com.victor.practice.simplefactory;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if(getValue2() != 0) {
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("Can not be zero.");
    }
}
