package chapter03;


import chapter03.InstanceFactory.Instance;

/**
 * @Author: HouX
 * @Date: 2020/12/15
 * @Description:
 */
public class SafeDoubleCheckedLocking {
    private volatile static Instance instance;  //volatile 禁止指令重排 保证线程安全的延迟初始化

    public static Instance getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null)
                    instance = new Instance();
            }
        }
        return instance;
    }
}
