package com.zjh.javathink.concurrent;

import java.util.ArrayList;
import java.util.concurrent.*;

public class MainThread {
    public static void main(String[] args) {
        //这里是main线程执行的run方法，要想使用其他线程，需要将Runnable类提交给Thread
//        LiftOff launch = new LiftOff();
//        launch.run();

        //等待发射 在倒计时之前，说明start（）早就返回了
//        Thread thread = new Thread(new LiftOff());
//        thread.start();
//        System.out.println("等待发射中！");

        //线程调度是不确定的
//        for (int i = 0; i < 5; i++) {
//            new Thread(new LiftOff()).start();
//        }
//        System.out.println("等待发射中！");

        //练习1，只要不发生阻塞，就不会一直执行一个线程的for方法吧
//        for (int i = 0; i < 5; i++) {
//            new Thread(new Execise1()).start();
//        }

        //使用Executor来管理线程对象
//        ExecutorService exec = Executors.newCachedThreadPool();
//        for (int i = 0; i < 5; i++) {
//            exec.execute(new LiftOff());
//        }
//        //这个方法可以防止新任务被提交给Executor
//        exec.shutdown();

        //SingleThread演示
//        ExecutorService exec = Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 5; i++) {
//            exec.execute(new LiftOff());
//        }
//        //这个方法可以防止新任务被提交给Executor
//        exec.shutdown();

        //线程返回值，Callable接口，submit方法会产生Future对象
//        ExecutorService exec = Executors.newCachedThreadPool();
//        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
//        for (int i = 0; i < 10; i++) {
//            results.add(exec.submit(new TaskWithResult(i)));
//        }
//        for (Future<String> fs:results){
//            try {
//                System.out.println(fs.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }finally {
//                exec.shutdown();
//            }
//        }


        //休眠
//        ExecutorService exec = Executors.newCachedThreadPool();
//        for (int i = 0; i < 5; i++) {
//            exec.execute(new SleepingTask());
//        }
//        exec.shutdown();

        //优先级——了解即可，一般不用
//        ExecutorService exec = Executors.newCachedThreadPool();
//        for (int i = 0; i < 5; i++) {
//            exec.execute(new SimplePriority(Thread.MIN_PRIORITY));
//        }
//        exec.execute(new SimplePriority(Thread.MAX_PRIORITY));
//        exec.shutdown();

    }

}
