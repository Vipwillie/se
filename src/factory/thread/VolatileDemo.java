package factory.thread;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/9 17:18</p>
 */
public class VolatileDemo {
    public static void main(String[] args) {
        TestVolatileThread[] testVolatileThread = new TestVolatileThread[100];
        for (int i = 0; i < 100; i++) {
            testVolatileThread[i] = new TestVolatileThread();
        }

        for (int i = 0; i < 100; i++) {
            testVolatileThread[i].start();
        }
    }
}
