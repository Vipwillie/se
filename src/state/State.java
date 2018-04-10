package state;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 15:35</p>
 */
public interface State {
    /**
     * 状态对应的处理
     *
     * @param sampleParameter
     */
    void handle(String sampleParameter);
}
