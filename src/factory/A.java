package factory;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/5/3115:49</p>
 */
public class A {
    public static void main(String[] args) {
        Sender sender=new SenderFactory().produce("factory.MailSender");
        sender.send();
    }
}
