package strategy;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 14:13</p>
 */
public class Context2 {
    private Strategy2 strategy2;

    public Context2(Strategy2 strategy2) {
        this.strategy2 = strategy2;
    }

    public void contextInterface() {
        strategy2.algorithmInterface();
    }
}
