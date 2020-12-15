package chapter03;


import chapter03.InstanceFactory.Instance;

/**
 * @Author: HouX
 * @Date: 2020/12/15
 * @Description:
 */
public class SafeLazyInitialization {
    private static Instance instance;

    public synchronized static Instance getInstance() {
        if (instance == null)
            instance = new Instance();
        return instance;
    }
}
