package com.victor.practice.strategyandtemplate;

public class FileLog extends LogStrategyTemplate {
    @Override
    protected void doLog(String msg) {
        System.out.println("Save log: " + msg + " to file.");
    }
}
