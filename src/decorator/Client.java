package decorator;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/24 9:28</p>
 */
public class Client {
    public static void main(String[] args) {
        SchoolReport schoolReport;

        schoolReport = new FouthGradeSchoolReport();
        schoolReport = new HignScoreDecorator(schoolReport);
        schoolReport = new SortDecorator(schoolReport);
        schoolReport.report();
        schoolReport.sign("老三");
    }
}
