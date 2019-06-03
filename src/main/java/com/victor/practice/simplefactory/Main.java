package com.victor.practice.simplefactory;

public class Main {
    public static void main(String[] args) {
        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setValue1(1);
        operationAdd.setValue2(2);
        System.out.println(operationAdd.getResult());
    }
}
