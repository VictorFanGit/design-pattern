package com.victor.practice.strategyandtemplate;

public class DbLog extends LogStrategyTemplate {
    @Override
    protected void doLog(String msg) {
        if(msg != null && msg.trim().length() > 30) {
            throw new IllegalArgumentException("Content is too long.");
        }
        System.out.println("Save log: " + msg + " to db.");
    }
}
