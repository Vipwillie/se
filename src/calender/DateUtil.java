package calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/11/913:51</p>
 */
public class DateUtil {
    private static SimpleDateFormat simpleDateFormat = null;
    private static final int ONE_WEEK = 7;
    private static final long ONE_DAY = 1000 * 60 * 60 * 24;


    private DateUtil() {

    }

    /**
     * 返回指定日期
     *
     * @param date 指定日期
     * @return 返回指定日期
     */
    public static String Date2String(Date date) {
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    /**
     * 按指定格式返回日期
     *
     * @param date    日期
     * @param pattern 指定模式
     * @return 返回日期
     */
    public static String Date2String(Date date, String pattern) {
        simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * 返回指定日期
     *
     * @param date 指定日期
     * @return 返回指定日期
     */
    public static Date String2Date(String date) {
        Date returnDate = new Date();
        try {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            returnDate = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return returnDate;
    }

    /**
     * 得到某年某周的第一天
     *
     * @param year 年份
     * @param week 周
     * @return 得到某年某周的第一天
     */
    public static Date getFirstDayOfWeek(int year, int week) {
        week = week - 1;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DATE, 1);

        Calendar cal = (Calendar) calendar.clone();
        cal.add(Calendar.DATE, week * 7);

        return getFirstDayOfWeek(cal.getTime());
    }

    /**
     * 得到某年某周的最后一天
     *
     * @param year 年份
     * @param week 周
     * @return 得到某年某周的最后一天
     */
    public static Date getLastDayOfWeek(int year, int week) {
        week = week - 1;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DATE, 1);
        Calendar cal = (Calendar) calendar.clone();
        cal.add(Calendar.DATE, week * 7);

        return getLastDayOfWeek(cal.getTime());
    }

    /**
     * 取得当前日期所在周的第一天
     *
     * @param date 日期
     * @return 取得当前日期所在周的第一天
     */
    public static Date getFirstDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.SUNDAY);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK,
                calendar.getFirstDayOfWeek()); // Sunday
        return calendar.getTime();
    }

    /**
     * 取得当前日期所在周的最后一天
     *
     * @param date 日期
     * @return 取得当前日期所在周的最后一天
     */
    public static Date getLastDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.SUNDAY);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK,
                calendar.getFirstDayOfWeek() + 6); // Saturday
        return calendar.getTime();
    }

    /**
     * 取得当前日期所在周的前一周最后一天
     *
     * @param date 日期
     * @return 取得当前日期所在周的前一周最后一天
     */
    public static Date getLastDayOfLastWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getLastDayOfWeek(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.WEEK_OF_YEAR) - 1);
    }

    /**
     * 返回指定日期的月的第一天
     *
     * @param date 日期
     * @return 返回指定日期的月的第一天
     */
    public static Date getFirstDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH), 1);
        return calendar.getTime();
    }

    /**
     * 返回指定年月的月的第一天
     *
     * @param year  年份
     * @param month 月份
     * @return 返回指定年月的月的第一天
     */
    public static Date getFirstDayOfMonth(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        if (year == null) {
            year = calendar.get(Calendar.YEAR);
        }
        if (month == null) {
            month = calendar.get(Calendar.MONTH);
        }
        calendar.set(year, month, 1);
        return calendar.getTime();
    }

    /**
     * 返回指定日期的月的最后一天
     *
     * @param date 日期
     * @return 返回指定日期的月的最后一天
     */
    public static Date getLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH), 1);
        calendar.roll(Calendar.DATE, -1);
        return calendar.getTime();
    }

    /**
     * 返回指定年月的月的最后一天
     *
     * @param year  年份
     * @param month 月份
     * @return 返回指定年月的月的最后一天
     */
    public static Date getLastDayOfMonth(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        if (year == null) {
            year = calendar.get(Calendar.YEAR);
        }
        if (month == null) {
            month = calendar.get(Calendar.MONTH);
        }
        calendar.set(year, month, 1);
        calendar.roll(Calendar.DATE, -1);
        return calendar.getTime();
    }

    /**
     * 返回指定日期的上个月的最后一天
     *
     * @param date 日期
     * @return 返回指定日期的上个月的最后一天
     */
    public static Date getLastDayOfLastMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH) - 1, 1);
        calendar.roll(Calendar.DATE, -1);
        return calendar.getTime();
    }

    /**
     * 返回指定日期的季的第一天
     *
     * @param date 日期
     * @return 返回指定日期的季的第一天
     */
    public static Date getFirstDayOfQuarter(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getFirstDayOfQuarter(calendar.get(Calendar.YEAR),
                getQuarterOfYear(date));
    }

    /**
     * 返回指定年季的季的第一天
     *
     * @param year    年份
     * @param quarter 季度
     * @return 返回指定年季的季的第一天
     */
    public static Date getFirstDayOfQuarter(Integer year, Integer quarter) {
        Calendar calendar = Calendar.getInstance();
        int[] month = new int[]{0, 3, 6, 9};
        int i = quarter.intValue() - 1;
        if (i > 3 || i < 0) {
            return getFirstDayOfMonth(year, calendar.get(Calendar.MONTH));
        } else {
            return getFirstDayOfMonth(year, month[i]);
        }
    }

    /**
     * 返回指定日期的季的最后一天
     *
     * @param date 日期
     * @return 返回指定日期的季的最后一天
     */
    public static Date getLastDayOfQuarter(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getLastDayOfQuarter(calendar.get(Calendar.YEAR),
                getQuarterOfYear(date));
    }

    /**
     * 返回指定年季的季的最后一天
     *
     * @param year    年份
     * @param quarter 季度
     * @return 返回指定年季的季的最后一天
     */
    public static Date getLastDayOfQuarter(Integer year, Integer quarter) {
        Calendar calendar = Calendar.getInstance();
        int[] month = new int[]{2, 5, 8, 11};
        int i = quarter.intValue() - 1;
        if (i > 3 || i < 0) {
            return getLastDayOfMonth(year, calendar.get(Calendar.MONTH));
        } else {
            return getLastDayOfMonth(year, month[i]);
        }
    }

    /**
     * 返回指定日期的上一季的最后一天
     *
     * @param date 日期
     * @return 返回指定日期的上一季的最后一天
     */
    public static Date getLastDayOfLastQuarter(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getLastDayOfLastQuarter(calendar.get(Calendar.YEAR),
                getQuarterOfYear(date));
    }

    /**
     * 返回指定年季的上一季的最后一天
     *
     * @param year    年份
     * @param quarter 季度
     * @return 返回指定年季的上一季的最后一天
     */
    public static Date getLastDayOfLastQuarter(Integer year, Integer quarter) {
        Calendar calendar = Calendar.getInstance();
        int[] month = new int[]{11, 2, 5, 8};
        int i = quarter.intValue() - 1;
        if (i > 3 || i < 0) {
            return getLastDayOfMonth(year, calendar.get(Calendar.MONTH));
        } else {
            return getLastDayOfMonth(year, month[i]);
        }
    }

    /**
     * 返回指定日期的季度
     *
     * @param date 日期
     * @return 返回指定日期的季度
     */
    public static int getQuarterOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) / 3 + 1;
    }

    /**
     * 获取某年第一天日期
     *
     * @param year 年份
     * @return Date 获取某年第一天日期
     */
    public static Date getFirstDateOfYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        return calendar.getTime();
    }

    /**
     * 获取某年最后一天日期
     *
     * @param year 年份
     * @return Date 获取某年最后一天日期
     */
    public static Date getLastDayOfYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        return calendar.getTime();
    }

    /**
     * 取得起止时间的季度
     *
     * @param date1 起始时间
     * @param date2 截止时间
     * @return 取得起止时间的季度
     * @throws ParseException 日期操作异常
     */
    public static Map<String, Object> getQuarters(String date1, String date2) {
        Map<String, Object> quarterMap;

        Date d1 = String2Date(date1);
        Date d2 = String2Date(date2);

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(d1);
        calendar2.setTime(d2);

        //指定日期的年份
        Integer year1 = calendar1.get(Calendar.YEAR);
        Integer year2 = calendar2.get(Calendar.YEAR);

        int yearSize = year2 - year1;//起止日期间隔年
        if (yearSize > 1) {
            Date endDayOfYear = getLastDayOfYear(year1);//起始时间所在年份的最后一天
            quarterMap = getQuarterMaps4SameYear(date1, Date2String(endDayOfYear));
            year1++;
            for (int i = 0; i < yearSize - 1; i++) {
                Date sDate = getFirstDateOfYear(year1);
                Date eDate = getLastDayOfYear(year1);

                Map<String, Object> nextQuarterMap = getQuarterMaps4SameYear(Date2String(sDate), Date2String(eDate));
                quarterMap.putAll(nextQuarterMap);
                year1++;
            }
            Date startDayOfYear = getFirstDateOfYear(year2);//截至时间所在年份的第一天
            Map<String, Object> nextYearQuarterMap = getQuarterMaps4SameYear(Date2String(startDayOfYear), date2);
            quarterMap.putAll(nextYearQuarterMap);

        } else if (yearSize == 1) {
            Date endDayOfYear = getLastDayOfYear(year1);//起始时间所在年份的最后一天
            quarterMap = getQuarterMaps4SameYear(date1, Date2String(endDayOfYear));

            Date startDayOfYear = getFirstDateOfYear(year2);//截至时间所在年份的第一天
            Map<String, Object> nextYearQuarterMap = getQuarterMaps4SameYear(Date2String(startDayOfYear), date2);
            quarterMap.putAll(nextYearQuarterMap);
        } else {//同一年
            quarterMap = getQuarterMaps4SameYear(date1, date2);
        }

        return quarterMap;
    }

    /**
     * 取得同一年的季度
     *
     * @param date1 起始时间
     * @param date2 截至时间
     * @return 取得同一年的季度
     */
    public static Map<String, Object> getQuarterMaps4SameYear(String date1, String date2) {
        Map<String, Object> quarterMap = new LinkedHashMap<>();

        Date d1 = String2Date(date1);
        Date d2 = String2Date(date2);

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(d1);
        calendar2.setTime(d2);

        //指定日期的年份
        Integer year1 = calendar1.get(Calendar.YEAR);
        Integer year2 = calendar1.get(Calendar.YEAR);

        //指定日期的季度
        int quarter1 = getQuarterOfYear(d1);
        int quarter2 = getQuarterOfYear(d2);
        int quarterSize = quarter2 - quarter1;//起止日期间隔季度

        if (quarterSize > 1) {//跨季度
            List<String> dateList = new ArrayList<>(2);
            dateList.add(date1);
            dateList.add(Date2String(getLastDayOfQuarter(year1, quarter1)));
            String key1 = year1 + "." + quarter1 + "季";
            quarterMap.put(key1, dateList);
            quarter1++;

            for (int i = 0; i < quarterSize - 1; i++) {
                List<String> qDateList = new ArrayList<>();
                qDateList.add(Date2String(getFirstDayOfQuarter(year1, quarter1)));
                qDateList.add(Date2String(getLastDayOfQuarter(year1, quarter1)));
                String key = year1 + "." + quarter1 + "季";
                quarterMap.put(key, qDateList);
                quarter1++;
            }

            List<String> dateList1 = new ArrayList<>();
            dateList1.add(Date2String(getFirstDayOfQuarter(year2, quarter2)));
            dateList1.add(date2);
            String key2 = year1 + "." + quarter2 + "季";
            quarterMap.put(key2, dateList1);
        } else if (quarterSize == 1) {
            List<String> dateList = new ArrayList<>(2);
            dateList.add(date1);
            dateList.add(Date2String(getLastDayOfQuarter(year1, quarter1)));//起始时间所在季度的最后一天
            String key1 = year1 + "." + quarter1 + "季";
            quarterMap.put(key1, dateList);

            List<String> dateList1 = new ArrayList<>(2);
            dateList1.add(Date2String(getFirstDayOfQuarter(year2, quarter2)));
            dateList1.add(date2);
            String key2 = year1 + "." + quarter2 + "季";
            quarterMap.put(key2, dateList1);
        } else {//同一季度
            List<String> strDateList = new ArrayList<>(2);
            strDateList.add(date1);
            strDateList.add(date2);
            String key = year1 + "." + quarter1 + "季";
            quarterMap.put(key, strDateList);
        }

        return quarterMap;
    }

    /**
     * 取得起止时间的周
     *
     * @param startDateStr 起始时间
     * @param endDateStr   截止时间
     * @return 取得起止时间的周
     */
    public static Map<String, Object> getWeeks(String startDateStr, String endDateStr) {
        Date d1 = String2Date(startDateStr);
        Date d2 = String2Date(endDateStr);
        long time = Math.abs(d2.getTime() - d1.getTime());
        int days = (int) (time / ONE_DAY);//计算起止时间间隔的天数

        int weekSize = days / ONE_WEEK;//计算起止时间间隔的周数
        Map<String, Object> weekMap = new LinkedHashMap<>();
        if (weekSize == 0) {//起止时间不足一周
            List<String> date = new ArrayList<>(2);
            date.add(startDateStr);
            date.add(endDateStr);
            weekMap.put("第1周", date);
        } else {
            List<String> date = new ArrayList<>();
            date.add(startDateStr);//第一周的起始
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(d1);
            calendar.add(Calendar.DATE, 6);
            date.add(Date2String(calendar.getTime()));
            weekMap.put("第1周", date);
            for (int i = 1; i < weekSize; i++) {
                List<String> dateList = new ArrayList<>();
                calendar.add(Calendar.DATE, 1);
                dateList.add(Date2String(calendar.getTime()));
                calendar.add(Calendar.DATE, 6);
                dateList.add(Date2String(calendar.getTime()));
                weekMap.put("第" + (i + 1) + "周", dateList);
            }

            int extraDays = days % ONE_WEEK + 1;
            if (extraDays == 1) {//起止时间间隔N周后，多出的天数
                List<String> dateList = new ArrayList<>();
                calendar.add(Calendar.DATE, extraDays);
                dateList.add(Date2String(calendar.getTime()));
                dateList.add(Date2String(calendar.getTime()));
                weekMap.put("第" + (weekSize + 1) + "周", dateList);
            } else {
                List<String> dateList = new ArrayList<>();
                calendar.add(Calendar.DATE, 1);
                dateList.add(Date2String(calendar.getTime()));
                calendar.add(Calendar.DATE, extraDays - 1);
                dateList.add(Date2String(calendar.getTime()));
                weekMap.put("第" + (weekSize + 1) + "周", dateList);
            }
        }
        return weekMap;
    }
}
