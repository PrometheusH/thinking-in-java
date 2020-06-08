package com.zjh.javathink.concurrent;

public class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name,Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            //通过在Sleeper上调用join方法来等待被中断的Sleeper醒来，此时当前线程被挂起，等待sleeper线程执行结束才恢复
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
        System.out.println(getName()+" join completed");
    }
}
