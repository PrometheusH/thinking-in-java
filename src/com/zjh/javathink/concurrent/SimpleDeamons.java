package com.zjh.javathink.concurrent;

import java.util.concurrent.TimeUnit;

public class SimpleDeamons implements Runnable {
    @Override
    public void run() {

        while (true){
            try {
                TimeUnit.MICROSECONDS.sleep(10);
                System.out.println(Thread.currentThread()+" "+this);
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");
            }
        }
    }
}
