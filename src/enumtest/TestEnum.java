package enumtest;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/6/2716:43</p>
 */
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Code.getName(111));
        System.out.println(RequestMethod.GET.name().equals("GET"));
    }
}
