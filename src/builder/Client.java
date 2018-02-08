package builder;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/19 15:31</p>
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        director.getBmwModel().run();
    }
}
