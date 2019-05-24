package com.victor.practice.singleton;

//not good solution
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {

    }

    synchronized public static Singleton3 getInstance() {
        if(null == instance) {
            instance = new Singleton3();
        }
        return instance;
    }
}
