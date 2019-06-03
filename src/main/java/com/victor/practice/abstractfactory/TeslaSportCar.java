package com.victor.practice.abstractfactory;

public class TeslaSportCar implements TeslaCar {
    @Override
    public void charge() {
        System.out.println("Charge for my sport car.");
    }
}
