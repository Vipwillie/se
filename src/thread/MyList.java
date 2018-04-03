package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/9 17:38</p>
 */
public class MyList {
    private List list = new ArrayList<>();

    public void add() {
        list.add("高红颜");
    }

    public int size() {
        return list.size();
    }
}
