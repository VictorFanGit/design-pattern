package com.victor.practice.command;

public class GigaMainBoard implements MainBoardApi {

    @Override
    public void open() {
        System.out.println("start...");
        System.out.println("power on...");
        System.out.println("device checking...");
        System.out.println("load system...");
        System.out.println("start successfully.");
    }
}
