package com.victor.practice.strategyandtemplate;

public class Main {
    public static void main(String[] args) {
        LogContext logContext = new LogContext();
        logContext.log("log");
        logContext.log("record log once again");
    }
}
