package com.victor.practice.simplefactory;

public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        } else if(type == 3) {
            return new ConcreteProduct3();
        } else {
            return new ConcreteProduct1();
        }
    }
}
