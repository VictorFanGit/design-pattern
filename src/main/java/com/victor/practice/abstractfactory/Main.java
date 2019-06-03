package com.victor.practice.abstractfactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new SportCarFactory();
        BenzCar benzCar = carFactory.getBenzCar();
        benzCar.gasUp();
        TeslaCar teslaCar = carFactory.getTeslaCar();
        teslaCar.charge();
    }
}
