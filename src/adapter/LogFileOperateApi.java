package adapter;

import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 10:51</p>
 */
public interface LogFileOperateApi {
    List<LogModel> readLogFile();

    void writeLogFile(List<LogModel> list);
}
