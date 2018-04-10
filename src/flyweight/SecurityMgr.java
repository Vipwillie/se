package flyweight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 14:31</p>
 */
public class SecurityMgr {
    private static SecurityMgr securityMgr = new SecurityMgr();
    private Map<String, Collection<AuthorizationModel>> map = new HashMap<>();


    private SecurityMgr() {
    }

    public static SecurityMgr getInstance() {
        return securityMgr;
    }

    public void login(String user) {
        Collection<AuthorizationModel> col = queryByUser(user);
        map.put(user, col);

    }

    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<AuthorizationModel> collection = map.get(user);
        if (collection == null || collection.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }

        for (AuthorizationModel am : collection) {
            System.out.println("am=" + am);
            if (am.getSecurityEntity().equals(securityEntity) && am.getPermit().equals(permit)) {
                return true;
            }
        }
        return false;
    }

    private Collection<AuthorizationModel> queryByUser(String user) {
        Collection<AuthorizationModel> col = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String[] ss = s.split(",");
            if (ss[0].equals(user)) {
                AuthorizationModel am = new AuthorizationModel();
                am.setUser(ss[0]);
                am.setSecurityEntity(ss[1]);
                am.setPermit(ss[2]);
            }
        }
        return col;
    }
}
