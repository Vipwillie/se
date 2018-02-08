package builder;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/19 15:28</p>
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车应该这样停止。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车引擎是这个声音。。。");
    }
}
