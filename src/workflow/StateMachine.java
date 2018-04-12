package workflow;


/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 16:36</p>
 */
public class StateMachine {
    private State state;
    private Object BusinessVO;

    public void doWork() {
        this.state.doWork(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Object getBusinessVO() {
        return BusinessVO;
    }

    public void setBusinessVO(Object businessVO) {
        BusinessVO = businessVO;
    }
}
