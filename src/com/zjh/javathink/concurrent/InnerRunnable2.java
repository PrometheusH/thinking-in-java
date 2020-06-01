package com.zjh.javathink.concurrent;

public class InnerRunnable2 {
    private int countDown=5;
    private Thread t;
    public InnerRunnable2(String name){
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println(this);
                    if (--countDown==0) return;
                }
            }

            @Override
            public String toString() {
                return "InnerRunnable2:"+countDown;
            }
        },name);
        t.start();
    }
}
