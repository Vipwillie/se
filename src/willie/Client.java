package willie;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/4/2111:39</p>
 */
public class Client {
    public static void main(String[] args) {
        Host host=new Host();
        Proxy proxy=new Proxy(host);
        proxy.rent();
    }
}
