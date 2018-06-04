package thread.day05;

import thread.day05.tools.ThreadB;
import thread.day05.tools.Tools;

/************************************************
 * <p>Copyright © by whxxykj</p>
 * <p>All right reserved.</p>
 * <p>Create Author: Willie</p>
 * <p> Create Date  : 2018/5/21</p>
 * <p>Last version : 1.0</p>
 * <p>Description  : </p>
 * <p>Last Update Date:</p>
 * <p>Change Log:</p>
 **************************************************/
public class Run {

    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();
            threadA.start();
            threadB.start();
            for (int i = 0; i < 100; i++) {
                Tools.threadLocal.set("Main " + (i + 1));
                System.out.println("Main get Value=" + Tools.threadLocal.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
