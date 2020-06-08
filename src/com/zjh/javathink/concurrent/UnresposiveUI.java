package com.zjh.javathink.concurrent;

public class UnresposiveUI {
    public volatile double d=1;

    public UnresposiveUI() throws Exception {
        while (d>0)
            d = d+(Math.PI+Math.E) /d;
        System.in.read();
    }
}
