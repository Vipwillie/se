package workflow;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 16:38</p>
 */
public interface State {
    void doWork(StateMachine stateMachine);
}
