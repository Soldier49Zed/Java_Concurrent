package chapter08;

import java.util.concurrent.CyclicBarrier;

/**
 * @Author: HouX
 * @Date: 2020/12/26
 * @Description:
 */
public class CyclicBarrierTest2 {
    static CyclicBarrier c = new CyclicBarrier(2,new A());

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c.await();
                }catch (Exception e){

                }
                System.out.println(1);
            }
        }).start();

        try {
            c.await();
        }catch (Exception e){

        }
        System.out.println(2);
    }

    private static class A implements Runnable {
        @Override
        public void run() {
            System.out.println(3);
        }
    }
}
