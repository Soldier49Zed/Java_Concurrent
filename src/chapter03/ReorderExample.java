package chapter03;

/**
 * @Author: HouX
 * @Date: 2020/12/13
 * @Description:
 */
public class ReorderExample {
    int a = 0;
    boolean flag = false;

    public void writer() {
        a = 1;              //1
        flag = true;        //2
    }

    public void reader() {
        if (flag) {         //3
            int i = a * a;  //4
        }
    }
}
