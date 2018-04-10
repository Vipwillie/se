package flyweight;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 14:38</p>
 */
public class Client {
    public static void main(String[] args) {
//        SecurityMgr mgr = SecurityMgr.getInstance();
        SecurityMgr2 mgr = SecurityMgr2.getInstance();
        mgr.login("张三");
        mgr.login("李四");
        boolean f1 = mgr.hasPermit("张三", "薪资数据", "查看");
        boolean f2 = mgr.hasPermit("李四", "薪资数据", "查看");

        System.out.println("f1==" + f1);
        System.out.println("f2==" + f2);

        for (int i = 0; i < 3; i++) {
            mgr.login("张三" + i);
            mgr.hasPermit("张三" + i, "薪资数据", "查看");
        }
    }
}
