package chapter05;

import chapter04.SleepUtils;

import java.util.concurrent.locks.Lock;

/**
 * @Author: HouX
 * @Date: 2020/12/22
 * @Description:
 */
public class TwinsLockTest {

    public static void main(String[] args) {

        final Lock lock = new TwinsLock();
        class Worker extends Thread {
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        SleepUtils.second(1L);
                        System.out.println(Thread.currentThread().getName());
                        SleepUtils.second(1L);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }
        // 启动10个线程
        for (int i = 0; i < 10; i++) {
            Worker worker = new Worker();
            worker.setDaemon(true);
            worker.start();
        }
        //每隔一秒换行
        for (int i = 0; i < 10; i++) {
            SleepUtils.second(1L);
            System.out.println();
        }
    }
}
