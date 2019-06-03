package com.victor.practice.abstractfactory;

public class TeslaBusinessCar implements TeslaCar {
    @Override
    public void charge() {
        System.out.println("Charge for my business car.");
    }
}
