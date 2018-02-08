package kotlin;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/3 10:23</p>
 */
public class Test {
    public static void main(String[] args) {
        String val = "3.0";
        BigDecimal bigDecimal = new BigDecimal(val);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        val = decimalFormat.format(bigDecimal);
        System.out.println(val);
    }
}
