package com.victor.practice.strategy;

public class Main {
    public static void main(String[] args) {
        LargeCustomerStrategy strategy = new LargeCustomerStrategy();
        Price price = new Price(strategy);
        double quote = price.quote(1000);
        System.out.println(quote);
    }
}
