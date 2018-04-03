package factory.thread.day01;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/10 11:37</p>
 */
public class Run2 {
    public static void main(String[] args) {
        String lock = "";
        P p = new P(lock);
        C r = new C(lock);

        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(r);

        threadP.start();
        threadC.start();
    }
}
