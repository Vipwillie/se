package excel.jxls;

import calender.DateUtil;
import org.jxls.common.Context;

import java.io.File;
import java.util.*;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/21 10:50</p>
 */
public class TestJxls {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(6);
        studentList.add(new Student("001", "a", 11, DateUtil.String2Date("2011-01-02"), "男", 89.5D));
        studentList.add(new Student("003", "h", 31, DateUtil.String2Date("2011-03-23"), "女", 69.5D));
        studentList.add(new Student("002", "c", 21, DateUtil.String2Date("2011-07-01"), "男", 89.5D));
        studentList.add(new Student("005", "b", 10, DateUtil.String2Date("2011-10-11"), "女", 99.5D));
        studentList.add(new Student("008", "e", 18, DateUtil.String2Date("2011-08-08"), "男", 59.5D));
        studentList.add(new Student("006", "f", 13, DateUtil.String2Date("2011-11-02"), "男", 80.5D));

        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(2);

        Map<String, Object> map1 = new HashMap<>(3);
        map1.put("subject", "高数");
        map1.put("date", DateUtil.Date2String(new Date()));
        map1.put("students", studentList.subList(0, 3));
        list.add(map1);

        Map<String, Object> map2 = new HashMap<>(3);
        map2.put("subject", "高数");
        map2.put("date", DateUtil.Date2String(new Date()));
        map2.put("students", studentList.subList(3, studentList.size()));
        list.add(map2);

        Context context = new Context();
        context.putVar("report", list);
        context.putVar("sheetNames", Arrays.asList("sheet1", "sheet2"));

        JxlsExport2ExcelUtil.generateExcel("D:" + File.separator + "willie" + File.separator + "src" + File.separator + "excel" + File.separator + "jxls" + File.separator + "student.xls", context, "D:" + File.separator + "willie" + File.separator + "src" + File.separator + "excel" + File.separator + "学生成绩表.xls", true);
        System.out.println("==================导出完成==============");
    }
}
