package state;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 15:42</p>
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager2 voteManager) {
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");
        voteManager.getMapState().put(user, new RepeatVoteState());
    }
}
