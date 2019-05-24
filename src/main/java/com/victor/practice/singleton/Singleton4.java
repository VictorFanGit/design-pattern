package com.victor.practice.singleton;

import static java.lang.Runtime.getRuntime;

//prefer this solution
public class Singleton4 {

    private Singleton4() {

    }

    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        getRuntime();
        return SingletonHolder.INSTANCE;
    }

}
