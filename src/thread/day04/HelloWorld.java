package thread.day04;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/3 14:33</p>
 */
public class HelloWorld {
    public static void main(String[] args) {
        try {
            Thread myThread = new Thread() {
                @Override
                public void run() {
                    System.out.println("hello from new thread");
                }
            };

            myThread.start();
            Thread.yield();
            System.out.println("hello from main thread");

            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
