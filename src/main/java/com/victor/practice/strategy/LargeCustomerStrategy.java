package com.victor.practice.strategy;

public class LargeCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("10 percents off for large customer.");
        return goodsPrice * (1 - 0.1);
    }
}
