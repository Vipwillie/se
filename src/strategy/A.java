package strategy;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/6/216:44</p>
 */
public class A {
    public static void main(String[] args) {
        BackDoor backDoor=new BackDoor();
        Context context=new Context(backDoor);
        context.operate();
    }
}
