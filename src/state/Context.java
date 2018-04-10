package state;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 15:37</p>
 */
public class Context {
    //持有一个State类型的对象类型实例
    private State state;

    public void request(String sampleParameter) {
        //处理中，转调state类处理
        state.handle(sampleParameter);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
