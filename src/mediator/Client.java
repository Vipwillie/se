package mediator;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/22 15:24</p>
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("------------采购人员采购电脑---------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);

        System.out.println("------------销售人员采购电脑---------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);

        System.out.println("------------库房管理人员清仓处理---------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
