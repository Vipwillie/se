package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 10:32</p>
 */
public class Facade {

    private Facade(){}

    public static void test() {
        AModuleApi aModuleApi = new AModuleImpl();
        aModuleApi.testA();
        BModuleApi bModuleApi = new BModuleImpl();
        bModuleApi.testB();
        CModuleApi cModuleApi = new CModuleImpl();
        cModuleApi.testC();
    }

    public static void generate() {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
