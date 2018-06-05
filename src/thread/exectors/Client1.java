package thread.exectors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/************************************************
 * <p>Copyright © by whxxykj</p>
 * <p>All right reserved.</p>
 * <p>Create Author: Willie</p>
 * <p> Create Date  : 2018/6/5</p>
 * <p>Last version : 1.0</p>
 * <p>Description  : </p>
 * <p>Last Update Date:</p>
 * <p>Change Log:</p>
 **************************************************/
public class Client1 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();//单线程线程池
        es.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
        es.shutdown();//关闭线程
    }
}
