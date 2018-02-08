package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/26 11:23</p>
 */
public class TestTreeSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(6);
        list.add(23);
        list.add(13);
        list.add(18);
        list.add(1);
        list.add(17);
        list.add(17);

        TreeSet<Integer> treeSet = new TreeSet<>(list);
        System.out.println(treeSet.last());//最大值
        System.out.println(treeSet.first());//最小值
        System.out.println(treeSet.higher(treeSet.first()));//第二小值
        System.out.println(treeSet.lower(treeSet.last()));//第大值
        System.out.println(treeSet);
    }
}
