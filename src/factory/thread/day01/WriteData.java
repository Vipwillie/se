package factory.thread.day01;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/10 13:34</p>
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
