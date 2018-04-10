package state;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 15:49</p>
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager2 voteManager) {
        String s = voteManager.getMapVote().get(user);
        if (s != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷票行为,取消投票资格");

        if (voteManager.getMapVoteCount().get(user) >= 7) {
            voteManager.getMapState().put(user, new BlackVoteState());
        }
    }
}
