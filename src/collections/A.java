package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/5/3113:58</p>
 */
public class A {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        list1.add("dd");
        list1.add("ee");
        list1.add("ff");
//        ListUtils.retainAll(list1, list2);
        System.out.println(list1);
    }
}
