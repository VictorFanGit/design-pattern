package com.victor.practice.strategy;

public class NormalCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("No discount for normal customer.");
        return goodsPrice;
    }
}
