package com.victor.practice.strategy;

public class Price {
    private Strategy strategy = null;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double goodsPrice) {
        return this.strategy.calcPrice(goodsPrice);
    }
}
