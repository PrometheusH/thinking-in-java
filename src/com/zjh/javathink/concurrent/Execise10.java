package com.zjh.javathink.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 更改一下，每次调用runTask(int addten)都将传入的数字加10
 */
public class Execise10 {

    public Future<Integer> runTask(int addten){
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<Integer> res = exec.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return addten + 10;
            }
        });
        //注意如果没有这句话，程序就一直不能结束。
        exec.shutdown();
        return res;
    }
}
