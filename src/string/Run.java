package string;

/************************************************
 * <p>Copyright © by whxxykj</p>
 * <p>All right reserved.</p>
 * <p>Create Author: Willie</p>
 * <p> Create Date  : 2018/4/19</p>
 * <p>Last version : 1.0</p>
 * <p>Description  : </p>
 * <p>Last Update Date:</p>
 * <p>Change Log:</p>
 **************************************************/
public class Run {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        System.out.println("a:"+a.hashCode());
        System.out.println("b:"+b.hashCode());
        operate(a, b);
        System.out.println("a:"+a.hashCode());
        System.out.println("b:"+b.hashCode());
        System.out.println(a + "," + b);

    }

    public static void operate(StringBuffer x, StringBuffer y) {
        System.out.println("x:"+x.hashCode());
        System.out.println("y:"+y.hashCode());
        x.append(y);
        y = x;
        System.out.println("x:"+x.hashCode());
        System.out.println("y:"+y.hashCode());
    }
}
