package com.zjh.javathink.concurrent;

/**
 * 在构造器中创建一个匿名的Thread子类，并且向上转型为Thread引用t
 * 如果类中的其他方法需要访问t，那它们可以通过Thread的接口来实现，并不需要了解该对象的确切类型
 */
public class InnerThread2 {
    private int countDown=5;
    private Thread t;
    public InnerThread2(String name){
        t = new Thread(name){
            @Override
            public void run() {
                try {
                    while (true){
                        System.out.println(this);
                        if (--countDown==0);
                        sleep(10);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public String toString() {
                return getName()+":"+countDown;
            }
        };
        t.start();
    }
}
