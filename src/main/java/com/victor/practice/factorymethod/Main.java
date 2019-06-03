package com.victor.practice.factorymethod;

import com.victor.practice.simplefactory.Operation;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setValue1(1);
        operation.setValue2(2);
        System.out.println(operation.getResult());

    }
}
