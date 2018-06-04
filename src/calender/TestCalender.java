package calender;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/5/510:27</p>
 */
public class TestCalender {
    public static void main(String[] args) {
        String date1 = "2016-11-05";
        String date2 = "2017-11-15";

        Map<String, Object> quarterMap;
        Map<String, Object> weekMap;
        quarterMap = DateUtil.getQuarters(date1, date2);
        System.out.println(quarterMap);

        weekMap = DateUtil.getWeeks(date1, date2);
        System.out.println(weekMap);
    }

    private static Map<String, Object> getQuarters(String date1, String date2) {
        Map<String, Object> quarters = new HashMap<>();
        Date d1 = DateUtil.String2Date(date1);
        Date d2 = DateUtil.String2Date(date2);
        return quarters;
    }

}
