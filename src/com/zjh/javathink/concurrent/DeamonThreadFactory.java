package com.zjh.javathink.concurrent;

import java.util.concurrent.ThreadFactory;

/**
 * 与普通的ThreadFactory唯一的差异是将后台状态全部设置为true，可以将其作为参数传递给Executor.newCachedThreadPool()
 */
public class DeamonThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread();
        thread.setDaemon(true);
        return thread;
    }
}
