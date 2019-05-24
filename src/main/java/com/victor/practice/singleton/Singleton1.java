package com.victor.practice.singleton;

public class Singleton1 {
    //volatile keyword is used to consistent execution step order
    private static volatile Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
