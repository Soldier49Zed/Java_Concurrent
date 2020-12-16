package chapter04;

import java.util.concurrent.TimeUnit;

/**
 * @Author: HouX
 * @Date: 2020/12/16
 * @Description:
 */
public class SleepUtils {
    public static final void second(Long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
