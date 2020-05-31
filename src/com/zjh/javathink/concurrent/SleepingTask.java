package com.zjh.javathink.concurrent;

import java.util.concurrent.TimeUnit;

/**
 *  休眠
 *  将LiftOff中的yeild换成sleep，观察线程休眠情况
 */
public class SleepingTask extends LiftOff {
    public void run(){
        try {//异常不能跨线程传回main，必须在此地处理
            while (countDown-->0){
                System.out.println(status());
                //旧版本是Thread.sleep(100)
                TimeUnit.MICROSECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
