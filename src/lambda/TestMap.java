package lambda;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/3/29 10:31</p>
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, Object> info = new HashMap<>(3);
        info.put("s1", 21);
        info.put("s2", 11);
        info.put("s3", 9);

        //方法一
        info.forEach((k, v) -> System.out.println(k + ":" + v));
        //方法二
        /*info.entrySet().forEach((entity) -> {
            System.out.println(entity.getKey() + ":" + entity.getValue());
        });*/
    }
}
