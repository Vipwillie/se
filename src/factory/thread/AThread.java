package factory.thread;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/9 17:39</p>
 */
public class AThread extends Thread {

    private MyList list;

    public AThread(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            list.add();
            System.out.println("添加了" + (i + 1) + "个元素");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
