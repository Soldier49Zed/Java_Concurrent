package chapter03;

/**
 * @Author: HouX
 * @Date: 2020/12/15
 * @Description:
 */
public class FinalReferenceEscapeExample {
    final int i;
    static FinalReferenceEscapeExample obj;

    public FinalReferenceEscapeExample() {
        i = 1;                              //1 写final域
        obj = this;                         //2 this引用在此 逸出
    }

    public static void writer() {
        new FinalReferenceEscapeExample();
    }

    public static void reader() {
        if (obj != null) {                  //3
            int temp = obj.i;               //4
        }
    }
}