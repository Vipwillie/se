package state;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 15:48</p>
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager2 voteManager) {
        System.out.println("请不要重复投票");
        if (voteManager.getMapVoteCount().get(user) >= 4) {
            voteManager.getMapState().put(user, new SpiteVoteState());
        }
    }
}
