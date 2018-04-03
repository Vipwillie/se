package thread.join;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/11 11:13</p>
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.join();
            System.out.println("我想当threadTest对象执行完毕我在执行，我做到了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
