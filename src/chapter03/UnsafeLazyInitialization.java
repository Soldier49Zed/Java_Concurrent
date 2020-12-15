package chapter03;

import chapter03.InstanceFactory.Instance;

/**
 * @Author: HouX
 * @Date: 2020/12/15
 * @Description:
 */
public class UnsafeLazyInitialization {

    private static Instance instance;

    public static Instance getInstance() {
        if (instance == null)           //1.A线程执行
            instance = new Instance();  //2.B线程执行
        return instance;
    }
}
