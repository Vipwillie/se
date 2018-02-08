package component;

import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/24 9:44</p>
 */
public interface IRoot {
    String getInfo();

    void add(IBranch branch);

    void add(ILeaf leaf);

    <E> List<E> getSubordinateInfo();
}
