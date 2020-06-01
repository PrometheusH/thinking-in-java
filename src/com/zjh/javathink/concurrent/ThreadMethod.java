package com.zjh.javathink.concurrent;

public class ThreadMethod {
    private int countDown=5;
    private String name;
    private Thread t;

    public ThreadMethod(String name) {
        this.name = name;
    }
    public void runTask(){
        if (t==null){
            t = new Thread(name){
                @Override
                public void run() {
                    while (true){
                        System.out.println(this);
                        if (--countDown==0)return;
                    }
                }

                @Override
                public String toString() {
                    return "ThreadMethod:"+countDown;
                }
            };
        }
        t.start();
    }
}
