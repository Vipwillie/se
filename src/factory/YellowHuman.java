package factory;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/16 17:00</p>
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人中的皮肤是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般是双音节的");
    }
}
