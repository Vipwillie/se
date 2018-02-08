package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/8/2417:59</p>
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        List<Test> testList = new ArrayList<Test>(0);
        for (int i = 0; i < 2; i++) {
            Test t = new Test();
            t = a.getTest();
            testList.add(t);
        }
        System.out.println(testList.get(0).equals(testList.get(1)));
    }
}

class A {
    private Test test;

    public A() {
        test = new Test();
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}