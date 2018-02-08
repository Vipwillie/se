package jackson;

import com.alibaba.fastjson.JSONArray;
import com.company.willie.Student;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/6 17:22</p>
 */
public class TestJackson {
    public static void main(String[] args) {
        Student student1 = new Student("a", 12);
        Student student2 = new Student("b", 11);
        Student student3 = new Student("c", 16);
        long before = System.currentTimeMillis();
        JSONArray jsonArray = new JSONArray(3);
        jsonArray.add(student1);
        jsonArray.add(student2);
        jsonArray.add(student3);
        long after = System.currentTimeMillis();
        System.out.println((after - before));
        System.out.println(jsonArray);
    }
}
