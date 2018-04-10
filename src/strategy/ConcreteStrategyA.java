package strategy;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 14:11</p>
 */
public class ConcreteStrategyA implements Strategy2 {
    @Override
    public void algorithmInterface() {

    }

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于新客户或者普通客户，没有折扣");
        return goodsPrice;
    }
}
