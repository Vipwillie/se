package flyweight;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 14:28</p>
 */
public class TestDB {
    public static Collection<String> colDB = new ArrayList<>();

    static {
        colDB.add("张三，人员列表，查看");
        colDB.add("李四，人员列表，查看");
        colDB.add("李四，薪资数据，查看");
        colDB.add("李四，薪资数据，修改");

        for (int i = 0; i < 3; i++) {
            colDB.add("张三" + i + "，人员列表，查看");
        }
    }
}
