package com.zjh.javathink.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * 这个类跟一般的线程类没有什么区别
 */
public class DeamonFromFactory implements Runnable {
    @Override
    public void run() {
        while (true){
//            try {
//                TimeUnit.MICROSECONDS.sleep(10);
                System.out.println(Thread.currentThread()+ " " +this);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
