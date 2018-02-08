package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/5 11:46</p>
 */
public class Police {
    public void checkLetter(ILetterProcess iLetterProcess) {
        System.out.println(iLetterProcess + "信件已经检查过了...");
    }
}
