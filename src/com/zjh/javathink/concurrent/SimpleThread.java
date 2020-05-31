package com.zjh.javathink.concurrent;

/**
 * 创建线程类的另一种方法，不用Runnable，不在main中用start()
 */
public class SimpleThread extends Thread {
    private int countDown=5;
    private static int threadCount=0;

    public SimpleThread(){
        super(Integer.toString(++threadCount));
        //在构造器中调用start()可能会很有问题，因为另一个任务可能会在构造器结束之前开始执行，这意味着该任务能够访问处于不确定状态的对象
        //这是优选Excutor而不是显示地创建Thread对象的原因
        start();
    }

    @Override
    public String toString() {
        return "#" +getName()+
                "(countDown=" + countDown +
                ')';
    }

    @Override
    public void run() {
        while (true){
            System.out.println(this);
            if (--countDown==0){
                //return了线程就结束了
                return;
            }
        }
    }

}
