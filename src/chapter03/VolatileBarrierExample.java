package chapter03;

/**
 * @Author: HouX
 * @Date: 2020/12/14
 * @Description:
 */
public class VolatileBarrierExample {
    int a;

    volatile int v1 = 1;
    volatile int v2 = 2;

    void readAndWriter() {
        int i = v1;     //第一个volatile读
        int j = v2;     //第二个volatile读
        a = i + j;      //普通写
        v1 = i + 1;     //第一个volatile写
        v2 = j * 2;     //第二个volatile写
    }
    //...其他方法
}
