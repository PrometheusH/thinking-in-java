package com.zjh.javathink.concurrent;

/**
 * 使用Runnable的内部类
 */
public class InnerRunnable1 {
    private int countDown=5;
    private Inner inner;
    private class Inner implements Runnable{
        Thread t;
        Inner(String name){
            t = new Thread(this,name);
            t.start();
        }
        @Override
        public void run() {
            while (true){
                System.out.println(this);
                if (--countDown==0)return;
            }
        }

        @Override
        public String toString() {
            return "InnerThread2:"+countDown;
        }
    }

    public InnerRunnable1(String name){
        inner = new Inner(name);
    }
}
