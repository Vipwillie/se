package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 10:21</p>
 */
public class DAO {
    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigModel();
        if (configModel.isNeedGenDAO()) {
            System.out.println("正在生成数据层代码文件");
        }
    }
}
