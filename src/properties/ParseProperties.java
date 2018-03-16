package properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/3/16 14:02</p>
 */
public class ParseProperties {
    private static final String PATH = "properties.test";

    public static void main(String[] args) {

        String value = getValue1();
        System.out.println(value);
    }

    /**
     * 资源文件读取方式二
     *
     * @return
     */
    public static String getValue1() {
        Properties properties = new Properties();
        InputStream is = ParseProperties.class.getClassLoader().getResourceAsStream("properties/test.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("key");
    }

    /**
     * 资源文件读取方式一
     *
     * @return
     */
    public static String getValue() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(PATH);
        return resourceBundle.getString("key");
    }
}
