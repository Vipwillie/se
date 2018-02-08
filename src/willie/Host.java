package willie;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/4/2111:07</p>
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("我是房东，我有房要出租!");
    }
}
