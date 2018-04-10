package state;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 15:43</p>
 */
public class VoteManager2 {
    private VoteState state;
    private Map<String, String> mapVote = new HashMap<>();
    private Map<String, Integer> mapVoteCount = new HashMap<>();
    //记录当前每个用户对应的状态处理对象,每个用户当前的装填是不同的
    private Map<String, VoteState> mapState = new HashMap<>();


    public void vote(String user, String voteItem) {
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount = oldVoteCount + 1;
        mapVoteCount.put(user, oldVoteCount);

        //各种状态平行执行行为
        /*if (oldVoteCount == 1) {
            state = new NormalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            state = new RepeatVoteState();
        } else if (oldVoteCount <= 5 && oldVoteCount < 8) {
            state = new SpiteVoteState();
        } else if (oldVoteCount >= 8) {
            state = new BlackVoteState();
        }*/
        VoteState state = mapState.get(user);
        //状态传递
        if (state == null) {
            state = new NormalVoteState();
        }
        state.vote(user, voteItem, this);
    }

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public Map<String, Integer> getMapVoteCount() {
        return mapVoteCount;
    }

    public Map<String, VoteState> getMapState() {
        return mapState;
    }
}
