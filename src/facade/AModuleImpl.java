package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 10:25</p>
 */
public class AModuleImpl implements AModuleApi {
    @Override
    public void testA() {
        System.out.println("现在A模块里面操作testA()方法");
    }
}
