package factory.thread.lock;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/11 11:32</p>
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread thread = new MyThread(service);
        thread.start();

        MyThread thread1 = new MyThread(service);
        thread1.start();
    }
}
