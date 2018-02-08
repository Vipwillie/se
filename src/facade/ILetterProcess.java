package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/5 11:40</p>
 */
public interface ILetterProcess {
    void writeContent(String content);

    void fillEnvelope(String address);

    void letterInotoEnvelope();

    void sendLetter();
}
