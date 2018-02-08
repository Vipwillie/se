package thread.day02;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/29 10:03</p>
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("我被启动了！");
    }
}
