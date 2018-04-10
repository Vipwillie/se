package state;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 15:30</p>
 */
public class Client {
    public static void main(String[] args) {
        VoteManager2 voteManager = new VoteManager2();
        for (int i = 0; i < 8; i++) {
            voteManager.vote("u1", "a");
        }
    }
}
