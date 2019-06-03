package com.victor.practice.abstractfactory;

public class BenzSportCar implements BenzCar {
    @Override
    public void gasUp() {
        System.out.println("Input the best gas.");
    }
}
