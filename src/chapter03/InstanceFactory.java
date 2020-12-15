package chapter03;

/**
 * @Author: HouX
 * @Date: 2020/12/15
 * @Description:
 */
public class InstanceFactory {
    private static class InstanceHolder {
        public static Instance instance = new Instance();
    }

    public static Instance getInstance() {
        return InstanceHolder.instance;//这里将导致InstanceHolder类被初始化
    }

    static class Instance {
    }
}