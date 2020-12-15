package chapter03;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: HouX
 * @Date: 2020/12/15
 * @Description:
 */
public class ReentrantLockExample {
    int a = 0;

    ReentrantLock lock = new ReentrantLock();

    public void writer() {
        lock.lock();        //获取锁
        try {
            a++;
        } finally {
            lock.unlock();  //释放锁
        }
    }

    public void reader(){
        lock.lock();
        try {               //获取锁
            int i = a;
        }finally {
            lock.unlock();  //释放锁
        }
    }

}
