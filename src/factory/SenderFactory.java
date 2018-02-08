package factory;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/5/3115:28</p>
 */
public class SenderFactory {
    public Sender produce(String type) {
        Sender sender = null;
        Class<?> clazz = null;
        try {
            clazz = Class.forName(type);
            sender = (Sender) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sender;
    }
}
