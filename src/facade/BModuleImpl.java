package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 10:27</p>
 */
public class BModuleImpl implements BModuleApi {
    @Override
    public void testB() {
        System.out.println("现在在B模块里操作testB()方法");
    }
}
