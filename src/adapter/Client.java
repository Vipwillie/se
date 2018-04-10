package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 11:00</p>
 */
public class Client {
    public static void main(String[] args) {
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("2000-03-01 10:08:18");
        logModel.setLogContent("这是个测试");

        List<LogModel> list = new ArrayList<>();
        list.add(logModel);
        LogFileOperateApi logFileOperateApi = new LogFileOperate("");

        LogDbOperateApi2 api2 = new Adapter(logFileOperateApi);

        api2.createLog(logModel);
        List<LogModel> logs = api2.getAllLog();
        System.out.println("allLog=" + logs);

        logFileOperateApi.writeLogFile(list);

        List<LogModel> readLog = logFileOperateApi.readLogFile();
        System.out.println("readLog=" + readLog);
    }
}
