package adapter;

import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 11:24</p>
 */
public class Adapter implements LogDbOperateApi2 {
    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void createLog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();
        list.add(logModel);
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, logModel);
            break;
        }
        adaptee.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();
        list.remove(logModel);
        adaptee.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
