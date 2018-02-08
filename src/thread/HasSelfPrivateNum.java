package thread;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/25 14:05</p>
 */
public class HasSelfPrivateNum {
    private int num = 0;

    public synchronized void add(String username) {
        try {
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(1000 * 2);
            } else {
                num = 200;
                System.out.println("b set over!");
            }

            System.out.println(username + " ,num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
