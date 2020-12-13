package chapter03;

/**
 * @Author: HouX
 * @Date: 2020/12/13
 * @Description:
 */
public class SynchronizedExample {
    int a = 0;
    boolean flag = false;

    public synchronized void writer() {  //获取锁
        a = 1;
        flag = true;
    }                                    //释放锁

    public synchronized void redaer() {  //获取锁
        if (flag) {
            int i = a;
        }
    }                                    //释放锁
}
