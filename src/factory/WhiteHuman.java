package factory;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/16 16:58</p>
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种说话，一般都是单音节的！");
    }
}
