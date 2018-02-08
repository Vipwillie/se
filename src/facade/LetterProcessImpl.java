package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/5 11:44</p>
 */
public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContent(String content) {
        System.out.println("填写的内容：" + content);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名。。。" + address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("把信放入信封中。。。");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件。。。");
    }
}
