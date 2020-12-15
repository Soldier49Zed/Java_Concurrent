package chapter03;


import chapter03.InstanceFactory.Instance;

/**
 * @Author: HouX
 * @Date: 2020/12/15
 * @Description:
 */
public class DoubleCheckedLocking {                     //1
    private static Instance instance;                   //2

    public static Instance getInstance() {              //3
        if (instance == null) {                         //4.第一次检查
            synchronized (DoubleCheckedLocking.class) { //5.加锁
                if (instance == null)                   //6.第二次检查
                    instance = new Instance();          //7.问题的根源出在这里，可能会出现重排序,有可能此时对象还没有被初始化
            }                                           //8
        }                                               //9
        return instance;                                //10
    }                                                   //11
}
