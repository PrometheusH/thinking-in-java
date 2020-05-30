package com.zjh.javathink.concurrent;

/**
 * 功能：显示发射之前的倒计时
 */
public class LiftOff implements Runnable{

    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#" + id +"("+(countDown>0?countDown:"发射！")+"),";
    }

    public void run(){
        while (countDown-->0){
            System.out.println(status());
            //这句话是在告诉系统，本线程的最重要任务已经执行完了，可以切换线程了。yield：让步
            Thread.yield();
        }
    }

}
