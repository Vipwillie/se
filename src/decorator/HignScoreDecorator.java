package decorator;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/24 9:24</p>
 */
public class HignScoreDecorator extends Decorator {

    public HignScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore() {
        System.out.println("这次成绩考的还不错哦");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
