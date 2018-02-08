package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/5 11:39</p>
 */
public class ModernPostOffice {
    private ILetterProcess iletterProcess = new LetterProcessImpl();
    private Police police = new Police();

    public void sendLetter(String address, String content) {
        iletterProcess.writeContent(content);
        iletterProcess.fillEnvelope(address);
        police.checkLetter(iletterProcess);
        iletterProcess.letterInotoEnvelope();
        iletterProcess.sendLetter();
    }
}
