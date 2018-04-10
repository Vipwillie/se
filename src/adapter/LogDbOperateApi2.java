package adapter;

import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 11:18</p>
 */
public interface LogDbOperateApi2 {
    void createLog(LogModel logModel);

    void updateLog(LogModel logModel);

    void removeLog(LogModel logModel);

    List<LogModel> getAllLog();
}
