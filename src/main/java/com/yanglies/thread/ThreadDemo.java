package com.yanglies.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/1/30.
 */
public class ThreadDemo {

    // 怎样控制线程的执行顺序

    static Thread thread1 = new Thread(new Runnable() {
        public void run() {
            System.out.println("thread1。。。");
        }
    });
    static Thread thread2 = new Thread(new Runnable() {
        public void run() {
            System.out.println("thread2。。。");
        }
    });
    static Thread thread3 = new Thread(new Runnable() {
        public void run() {
            System.out.println("thread3。。。");
        }
    });


    static ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws InterruptedException {
//        thread1.start();
//        thread1.join();
//        thread2.start();
//        thread2.join();
//        thread3.start();
        executor.execute(thread1);
        executor.execute(thread2);
        executor.execute(thread3);
        executor.shutdown();
    }
}
