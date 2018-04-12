package stream;

import java.util.stream.Stream;

/************************************************
 * Copyright (c)  by whxxykj
 * All right reserved.
 * Create Author: Willie
 * Create Date  : 2018/4/12
 * Last version : 1.0
 * Description  : 
 * Last Update Date:
 * Change Log:
 **************************************************/
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(checkVideoType(".avi"));
    }

    private static boolean checkVideoType(String fileName) {
//        List<String> vaildVideoType = Arrays.asList(".3gp", ".mp4", ".avi", ".wmv", ".mpg", ".mpeg", ".mov", ".flv");
        Stream<String> vaildVideoType = Stream.of(".3gp", ".mp4", ".avi", ".wmv", ".mpg", ".mpeg", ".mov", ".flv");
        return vaildVideoType.anyMatch(videoType -> fileName.endsWith(videoType));
    }
}
