package factory.thread;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/27 13:53</p>
 */
public class Run {

    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它! stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
