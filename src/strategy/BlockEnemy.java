package strategy;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/6/216:42</p>
 */
public class BlockEnemy implements Strategy {
    @Override
    public void operate() {
        System.out.println("阻断敌人");
    }
}
