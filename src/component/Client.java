package component;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/24 10:16</p>
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Composite root) {
        for (Component component : root.getChildren()) {
            if (component instanceof Leaf) {
                component.doSomething();
            } else {
                display((Composite) component);
            }
        }
    }
}
