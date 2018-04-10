package adapter;

import java.io.*;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 10:52</p>
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream ois = null;
        File file = new File(logFilePathName);
        if (file.exists()) {
            try {
                ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>) ois.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        File file = new File(logFilePathName);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
