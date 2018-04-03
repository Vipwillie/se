package thread;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/25 14:11</p>
 */
public class TestRun {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum1 = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNum2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum1);
        threadA.start();

        ThreadB threadB = new ThreadB(hasSelfPrivateNum2);
        threadB.start();
    }
}
