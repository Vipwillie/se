package factory.thread.day03;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/3/29 15:28</p>
 */
public class TestAutomic {
    public static void main(String[] args) {
        final int[] index = {0};
        for (int i = 0; i < 2; i++) {
            System.out.println(index[0]++);
        }
    }
}
