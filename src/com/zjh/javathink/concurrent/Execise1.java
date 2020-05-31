package com.zjh.javathink.concurrent;

/**
 * 练习1
 */
public class Execise1 implements Runnable{

    public Execise1(){
        System.out.println("#"+taskId+"（线程创建了！）");
    }

    private static int taskCount = 0;
    private final int taskId = taskCount++;

    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
            System.out.println("#"+taskId+"（该id的for循环的第 "+i+" 次运行）");
            Thread.yield();
        }
        System.out.println("#"+taskId+"（任务终止了！）");
    }
}
