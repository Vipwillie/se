package annotation;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/26 9:18</p>
 */
@Description(desc = "类注解", author = "willie")
public class ParseAnn {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("annotation.ParseAnn");
            //找到类上面的注解
            boolean hasAnnotation = clazz.isAnnotationPresent(Description.class);
            if (hasAnnotation) {
                //取得注解实例，解析类上面的注解
                Description description = (Description) clazz.getAnnotation(Description.class);
                System.out.println(description.author());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
