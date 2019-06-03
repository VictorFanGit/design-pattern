package com.victor.practice.abstractfactory;

public class BenzBusinessCar implements BenzCar {
    @Override
    public void gasUp() {
        System.out.println("Input the common gas.");
    }
}
