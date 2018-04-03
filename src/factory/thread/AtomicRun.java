package factory.thread;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/9 17:31</p>
 */
public class AtomicRun {
    public static void main(String[] args) {
        AddCountThread countThread = new AddCountThread();
        Thread t1 = new Thread(countThread);
        t1.start();
        Thread t2 = new Thread(countThread);
        t2.start();
        Thread t3 = new Thread(countThread);
        t3.start();
    }
}
