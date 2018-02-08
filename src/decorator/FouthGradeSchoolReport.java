package decorator;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/24 9:17</p>
 */
public class FouthGradeSchoolReport extends SchoolReport {

    @Override
    public void report() {
        System.out.println("xxx成绩不好噢");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名");
    }
}
