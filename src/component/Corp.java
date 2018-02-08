package component;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/24 10:02</p>
 */
public abstract class Corp {
    private String name = "";
    private String position = "";
    private int salary = 0;
    private List subordinateList = new ArrayList();

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "姓名：" + name;
        info = info + "\t职位：" + position;
        info = info + "\t薪水：" + salary;
        return info;
    }
}
