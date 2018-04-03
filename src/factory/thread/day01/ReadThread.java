package factory.thread.day01;

import java.io.PipedInputStream;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/10 13:41</p>
 */
public class ReadThread extends Thread {
    private ReadData readData;
    private PipedInputStream pipedInputStream;

    public ReadThread(ReadData readData, PipedInputStream pipedInputStream) {
        this.readData = readData;
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        readData.readMethod(pipedInputStream);
    }
}
