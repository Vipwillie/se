package thread.day01;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/10 13:37</p>
 */
public class ReadData {
    public void readMethod(PipedInputStream inp) {
        try {
            System.out.println("read:");
            byte[] bytes = new byte[20];
            int readLength = inp.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.println(newData);
                readLength = inp.read(bytes);
            }
            System.out.println();
            inp.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
