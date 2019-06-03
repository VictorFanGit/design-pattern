package com.victor.practice.strategyandtemplate;

public class LogContext {
    public void log(String msg) {
        LogStrategy strategy = new DbLog();
        try {
            strategy.log(msg);
        } catch (Exception e) {
            new FileLog().log(msg);
        }
    }
}
