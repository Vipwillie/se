package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/19 11:50</p>
 */
public abstract class CarModel {
    private List<String> sequence = new ArrayList<>();

    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 鸣笛
     */
    protected abstract void alarm();

    /**
     * 引擎
     */
    protected abstract void engineBoom();

    /**
     * 跑
     */
    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = sequence.get(i);
            if ("start".equals(actionName)) {
                start();
            } else if ("stop".equals(actionName)) {
                stop();
            } else if ("alarm".equals(actionName)) {
                alarm();
            } else if ("engine boom".equals(actionName)) {
                engineBoom();
            }
        }
    }

    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
