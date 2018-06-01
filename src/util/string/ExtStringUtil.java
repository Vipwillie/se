package util.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/************************************************
 * <p>Copyright © by whxxykj</p>
 * <p>All right reserved.</p>
 * <p>Create Author: Willie</p>
 * <p> Create Date  : 2018/6/1</p>
 * <p>Last version : 1.0</p>
 * <p>Description  : 字符串操作工具类</p>
 * <p>Last Update Date:</p>
 * <p>Change Log:</p>
 **************************************************/
public abstract class ExtStringUtil {
    /**
     * 使用引号拼接字符串
     *
     * @param list 待拼接参数
     * @return 引号拼接字符串
     */
    public static String concatenateStringWithQuotationMarks(List<String> list) {
        if (null == list || list.isEmpty()) {
            throw new NullPointerException();
        }
        StringBuilder stringBuilder = new StringBuilder();

        list.forEach(s -> {
            if (null != s) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(",").append("'").append(s).append("'");
                } else {
                    stringBuilder.append("'").append(s).append("'");
                }
            }
        });

        return stringBuilder.toString();
    }

    /**
     * 使用逗号拼接字符串
     *
     * @param collection 待拼接参数
     * @return 拼接后的字符串
     */
    public static String concatStringWithCommas(Collection<String> collection) {
        if (Objects.nonNull(collection) && !collection.isEmpty()) {
            return collection.stream().filter(s -> Objects.nonNull(s) && !s.isEmpty()).collect(Collectors.joining(","));
        }
        return null;
    }

    /**
     * 将按逗号分隔的字符串转成集合
     *
     * @param s 逗号分隔的字符串 如: "a,b"
     * @return 字符串集
     */
    public static List<String> StringConvert2List(String s) {
        return s != null ? Arrays.asList(s.split(",")) : null;
    }
}