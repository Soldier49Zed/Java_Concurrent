package chapter03;

/**
 * @Author: HouX
 * @Date: 2020/12/14
 * @Description:
 */
public class VolatileFeaturesExample {

    volatile long v1 = 0L;              //使用volatile声明64位的long型变量

    public void set(Long l) {
        v1 = l;                         //单个volatile变量的写
    }

    public void getAndIncrement() {
        long temp = get();
        temp += 1L;                     //复合（多个）volatile变量的读/写
        set(temp);
    }

    // public long get() {
    //     return v1;                      //单个volatile变量的读
    // }

    public synchronized long get() {    //对单个的普通变量的读用同一个锁同步
        return v1;
    }

}
