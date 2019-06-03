package com.victor.practice.strategy;

public class OldCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("5 percents off for old customer.");
        return goodsPrice * (1 - 0.05);
    }
}
