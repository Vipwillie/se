package strategy;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 14:02</p>
 */
public class Price {
    private Strategy2 strategy2 = null;

    public Price(Strategy2 strategy2) {
        this.strategy2 = strategy2;
    }

    public double quote(double goodsPrice) {
        return strategy2.calcPrice(goodsPrice);
    }
}
