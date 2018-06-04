package stream;

import java.util.stream.Stream;

/************************************************
 * <p>Copyright © by whxxykj</p>
 * <p>All right reserved.</p>
 * <p>Create Author: Willie</p>
 * <p> Create Date  : 2018/4/13</p>
 * <p>Last version : 1.0</p>
 * <p>Description  : </p>
 * <p>Last Update Date:</p>
 * <p>Change Log:</p>
 **************************************************/
public interface FileType {
    default boolean checkVideoType(String name) {
        Stream<String> vaildVideoType = Stream.of(".3gp", ".mp4", ".avi", ".wmv", ".mpg", ".mpeg", ".mov", ".flv");
        return vaildVideoType.anyMatch(videoType -> name.toLowerCase().endsWith(videoType));
    }

    default boolean checkVideoCoverType(String videoCoverName) {
        Stream<String> vaildVideoCoverType = Stream.of(".png", ".jpg", ".jpeg");
        return vaildVideoCoverType.anyMatch(videoCoverType -> videoCoverName.toLowerCase().endsWith(videoCoverType));
    }
}
