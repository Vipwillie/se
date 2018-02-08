package factory;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/16 17:06</p>
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory yinYangLu = new HumanFactory();
        Human human = yinYangLu.createHuman(WhiteHuman.class);
        human.getColor();
        human.talk();
    }
}
