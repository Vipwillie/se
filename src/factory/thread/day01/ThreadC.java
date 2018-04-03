package factory.thread.day01;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/10 11:35</p>
 */
public class ThreadC extends Thread {
    private C r;

    public ThreadC(C r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }
}
