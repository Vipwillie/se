package factory;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/5/3115:27</p>
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("======发送邮件======");
    }
}
