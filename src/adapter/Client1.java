package adapter;

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
        Targetable target = new Adepter1();
        target.method1();
        target.method2();
    }
}
