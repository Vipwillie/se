package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/19 15:45</p>
 */
public class Director {
    private BMWBuilder bmwBuilder = new BMWBuilder();
    private List<String> sequence = new ArrayList<>();

    public CarModel getBmwModel() {
        sequence.clear();

        sequence.add("start");
        sequence.add("stop");

        bmwBuilder.setSequence(sequence);
        return bmwBuilder.getCarModel();
    }


}
