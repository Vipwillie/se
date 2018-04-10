package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 15:17</p>
 */
public class FlyweightFactory {
    private static FlyweightFactory flyweightFactory = new FlyweightFactory();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return flyweightFactory;
    }

    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if (flyweight == null) {
            flyweight = new AuthorizationFlyweight(key);
            flyweightMap.put(key, flyweight);
        }
        return flyweight;
    }
}
