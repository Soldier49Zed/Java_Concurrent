package chapter08;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: HouX
 * @Date: 2020/12/26
 * @Description:
 */
public class ExchangerTest {
    private static final Exchanger<String> exgr = new Exchanger<>();

    private static ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String A = "银行流水A"; //A录入银行流水数据
                    exgr.exchange(A);
                } catch (Exception e) {

                }
            }
        });
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String B = "银行水流B";//B录入银行流水数据
                    String A = exgr.exchange("B");
                    System.out.println("A和B数据是否一致： " + A.equals(B) + ", A录入的是：" + A + ", B录入的是: " + B);
                } catch (Exception e) {

                }
            }
        });
        threadPool.shutdown();
    }
}
