package nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/22 16:22</p>
 */
public class NioTest {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(new File("student.xlsx")); FileOutputStream fos = new FileOutputStream(new File("A.xlsx"));) {
            FileChannel fcRead = fis.getChannel();
            FileChannel fcWrite = fos.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            while (true) {
                byteBuffer.clear();
                int r = fcRead.read(byteBuffer);
                if (r == -1) {
                    break;
                }
                byteBuffer.flip();
                fcWrite.write(byteBuffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
