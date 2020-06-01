package com.zjh.javathink.concurrent;

/**
 * 使用内部类来将线程代码隐藏在类中
 * 创建了一个扩展自Thread的匿名内部类，并在构造器中创建了这类的一个实例
 * 如果内部类具有你在其他方法中需要访问的特殊的方法，这样做将会很有意义
 * 不过，大多数时候，创建线程的原因只是为了使用Thread的能力，因此不用创建匿名内部类
 * 见InnerThread2
 */
public class InnerThread1 {
    private int countDown = 5;
    private Inner inner;

    private class Inner extends Thread {
        Inner(String name) {
            super(name);
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countDown == 0) {
                    return;
                }
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        @Override
        public String toString() {
            return getName()+":"+countDown;
        }
    }

    public InnerThread1(String name){
        inner = new Inner(name);
    }
}
