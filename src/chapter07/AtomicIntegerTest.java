package chapter07;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: HouX
 * @Date: 2020/12/26
 * @Description:
 */
public class AtomicIntegerTest {
    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());
    }
}
