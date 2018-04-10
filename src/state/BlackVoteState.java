package state;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 15:51</p>
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager2 voteManager) {
        System.out.println("进入黑名单，将禁止登录和使用本地系统");
    }
}
