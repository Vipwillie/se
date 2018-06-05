package thread.exectors;

import java.util.concurrent.*;

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
public class Client2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> task = () -> {
            TimeUnit.SECONDS.sleep(1);
            return 123;
        };

        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<Integer> future = es.submit(task);
        System.out.println(future.isDone());//检查future是否完成
        Integer result = future.get();
        System.out.println(future.isDone());
        System.out.println(result);
        es.shutdown();
    }
}
