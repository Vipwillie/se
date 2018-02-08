package component;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/24 9:49</p>
 */
public class Root implements IRoot {
    private List subordinateList = new ArrayList();

    private String name = "";
    private String position = "";
    private int salary = 0;

    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称" + name;
        info = info + "\t职位：" + position;
        info = info + "\t薪水：" + position;
        return info;
    }

    @Override
    public void add(IBranch branch) {
        subordinateList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        subordinateList.add(leaf);
    }

    @Override
    public <E> List<E> getSubordinateInfo() {
        return subordinateList;
    }
}
