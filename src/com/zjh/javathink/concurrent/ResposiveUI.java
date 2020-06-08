package com.zjh.javathink.concurrent;

public class ResposiveUI extends Thread {
    public static volatile double d=1;
    public ResposiveUI(){
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true){
            d = d+(Math.PI+Math.E)/d;
        }
    }
}