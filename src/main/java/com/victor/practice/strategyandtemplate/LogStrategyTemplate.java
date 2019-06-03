package com.victor.practice.strategyandtemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class LogStrategyTemplate implements LogStrategy {
    @Override
    public void log(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        msg = dateFormat.format(new Date()) + " " + msg;
        doLog(msg);
    }

    protected abstract void doLog(String msg);
}
