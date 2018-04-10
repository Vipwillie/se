package state;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 15:40</p>
 */
public interface VoteState {
    /**
     * 处理状态对应的行为
     *
     * @param user
     * @param voteItem
     * @param voteManager
     */
    void vote(String user, String voteItem, VoteManager2 voteManager);
}
