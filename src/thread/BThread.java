package thread;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/9 17:43</p>
 */
public class BThread extends Thread {
    private MyList list;

    public BThread(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (list.size() == 5) {
                    System.out.println("==5了，线程b要退出了！");
                }
                throw new InterruptedException();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
