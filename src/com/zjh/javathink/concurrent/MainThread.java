package com.zjh.javathink.concurrent;

import java.util.ArrayList;
import java.util.concurrent.*;

public class MainThread {
    public static void main(String[] args) throws Exception{
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

        //不用Exexutor的方法————没有，Callable就是配合Executor使用


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

        //后台进程
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(new SimpleDeamons());
//            thread.setDaemon(true);
//            thread.start();
//        }
//        System.out.println("全部的后台进程已经启动");
//        TimeUnit.MICROSECONDS.sleep(1750);

        //后台进程的另一种实现，不知道为什么使用了DeamonThreadFactory就不能打印，后台线程也启动不了，好气啊。
//        ExecutorService exec = Executors.newCachedThreadPool(new DeamonThreadFactory());
////        ExecutorService exec = Executors.newCachedThreadPool();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            exec.execute(new DeamonFromFactory());
//        }
//        exec.shutdown();
//        System.out.println("全部的后台进程已经启动");
//        TimeUnit.MICROSECONDS.sleep(10000000);


        //线程的第二种实现
//        for (int i = 0; i < 5; i++) {
//            new SimpleThread();
//        }

        //线程的第三种实现——没多大意义了


        //使用内部类来将线程代码隐藏在类中
//        InnerThread1 innerThread1 = new InnerThread1("InnerThread1");


        //练习10
//        Execise10 execise10 = new Execise10();
//        Integer integer = execise10.runTask(10).get();
//        System.out.println(integer);




    }

}
