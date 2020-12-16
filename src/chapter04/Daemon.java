package chapter04;

/**
 * @Author: HouX
 * @Date: 2020/12/16
 * @Description:
 */
public class Daemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(), "DaemonRunner");
        thread.setDaemon(true);
        thread.start();
    }

    static class DaemonRunner implements Runnable {

        @Override
        public void run() {
            try {
                SleepUtils.second(10L);
            } finally {
                System.out.println("DaemonThread finally run.");
            }
        }
    }
}
