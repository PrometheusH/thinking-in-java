package com.zjh.javathink.concurrent;

/**
 * 由于机器太好运算太快，看不出优先级来，即使进行浮点的大规模运算
 * 优先级没多大用，不是重点
 */
public class SimplePriority implements Runnable {
    private int countDown = 5;
    private volatile double b;
    private int priority;

    public SimplePriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread()+":"+countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true){
            for (int i = 0; i < 1000000; i++) {
                b+=(Math.PI+Math.E)/(double)i;
                if (i%10000==0){
                    Thread.yield();
                }
            }
            System.out.println(this);
            if (--countDown ==0) return;
        }

    }
}
