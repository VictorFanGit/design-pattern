package com.victor.practice.factorymethod2;

//reference: https://blog.csdn.net/yangzl2008/article/details/7644635
public class Main {
    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");
    }

}
