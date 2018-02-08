package model;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/19 11:13</p>
 */
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H1启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停止");
    }

    @Override
    public void slarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的");
    }

}
