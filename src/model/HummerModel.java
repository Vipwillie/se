package model;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/19 11:10</p>
 */
public abstract class HummerModel {

    /**
     * 启动
     */
    public abstract void start();

    /**
     * 停止
     */
    public abstract void stop();

    /**
     * 鸣笛
     */
    public abstract void slarm();

    /**
     * 引擎
     */
    public abstract void engineBoom();

    /**
     * 跑
     */
    public void run() {
        start();
        engineBoom();
        slarm();
        stop();
    }
}
