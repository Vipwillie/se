package component;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/24 9:54</p>
 */
public class Branch extends Corp implements IBranch {
    private List subordinateList = new ArrayList();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    @Override
    public void add(ICorp corp) {
        subordinateList.add(corp);
    }

    @Override
    public <E> List<E> getSubordinateInfo(ICorp corp) {
        return subordinateList;
    }
}
