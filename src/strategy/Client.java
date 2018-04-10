package strategy;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 14:19</p>
 */
public class Client {
    public static void main(String[] args) {
        Strategy2 strategy2 = new ConcreteStrategyA();
        Price price = new Price(strategy2);
        double quote = price.quote(100D);
        System.out.println("向客户报价:" + quote);
    }
}
