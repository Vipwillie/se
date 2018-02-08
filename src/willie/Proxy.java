package willie;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/4/2111:09</p>
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    private void findHouse() {
        System.out.println("带我去看房子");
    }

    private void getFee() {
        System.out.println("收取费用");
    }

    @Override
    public void rent() {
        findHouse();
        host.rent();
        getFee();
    }
}
