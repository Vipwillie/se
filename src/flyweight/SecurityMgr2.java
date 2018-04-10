package flyweight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 15:20</p>
 */
public class SecurityMgr2 {
    private static SecurityMgr2 securityMgr = new SecurityMgr2();

    private SecurityMgr2() {
    }

    public static SecurityMgr2 getInstance() {
        return securityMgr;
    }

    private Map<String, Collection<Flyweight>> map = new HashMap<>();

    public void login(String user) {
        Collection<Flyweight> collection = queryBuyUser(user);
        map.put(user, collection);
    }

    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> collection = map.get(user);
        if (collection == null && collection.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }

        for (Flyweight flyweight : collection) {
            System.out.println("flyweight" + flyweight);
            if (flyweight.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    private Collection<Flyweight> queryBuyUser(String user) {
        Collection<Flyweight> collection = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String[] ss = s.split(",");
            if (ss[0].equals(user)) {
                Flyweight flyweight = FlyweightFactory.getInstance().getFlyweight(ss[1] + "," + ss[2]);
                collection.add(flyweight);
            }
        }
        return collection;
    }
}
