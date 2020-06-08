package com.zjh.javathink.concurrent;

/**
 * 为了演示join方法的作用
 */
public class Sleeper extends Thread{
    private int duration;

    public Sleeper(String name,int duration) {
        super(name);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            //根据isInterrupted()方法来捕获InterruptedException异常，一旦捕获，isInterrupted()重新被设置为false。
            System.out.println(getName()+" was Interrapted. "+"isInterrupted():"+isInterrupted());
            return;
        }
        System.out.println(getName()+" has awakened");
    }
}
