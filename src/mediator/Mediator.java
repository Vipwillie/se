package mediator;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/22 14:50</p>
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if ("purchase.buy".equals(str)) {//采购电脑
            buyComputer((Integer) objects[0]);
        } else if ("sale.sell".equals(str)) {//销售电脑
            sellComputer((Integer) objects[0]);
        } else if ("sale.offsell".equals(str)) {//折价销售
            offSell();
        } else if ("stock.clear".equals(str)) {//清仓处理
            clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑：" + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;//这般采购
            System.out.println("采购IBM电脑：" + buyNumber + "台");
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyUBM();
    }

}
