package chapter08;

import java.util.concurrent.CyclicBarrier;

/**
 * @Author: HouX
 * @Date: 2020/12/26
 * @Description:
 */
public class CyclicBarrierTest3 {

    static CyclicBarrier c = new CyclicBarrier(2);

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c.await();
                }catch (Exception e){

                }
            }
        });
        thread.start();
        thread.interrupt();
        try {
            c.await();
        }catch (Exception e){

        }
        System.out.println(c.isBroken());
    }
}
