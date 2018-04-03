package factory.thread.day01;

import java.io.PipedOutputStream;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/10 13:42</p>
 */
public class WriteThread extends Thread {
    private WriteData writeData;
    private PipedOutputStream pos;

    public WriteThread(WriteData writeData, PipedOutputStream pos) {
        this.writeData = writeData;
        this.pos = pos;
    }

    @Override
    public void run() {
        writeData.writeMethod(pos);
    }
}
