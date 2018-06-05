package bridge;

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
public class Client {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        Sourceable sour = new SourceSub1();
        bridge.setSourceable(sour);
        bridge.method();



    }
}
