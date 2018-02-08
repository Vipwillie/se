package com.company.willie;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/4/1021:02</p>
 */
public class TestStream {
    public static void main(String[] args) {
        Student student = new Student("张三", 24);
        Student student1 = new Student("王五", 33);
        Student student2 = new Student("李四", 83);
        List list = new ArrayList(0);
        list.add(student);
        list.add(student1);
        list.add(student2);
        System.out.println(list);
        //-------------------------------------
        String json = JSON.toJSONString(student);
        String json1 = JSON.toJSONString(list);
        System.out.println(json);
        System.out.println(json1);
        //---------------------------------------------------------
        System.out.println(JSON.parseObject(json,Student.class));
        System.out.println(JSON.parseObject(json1,ArrayList.class));
    }
}
