package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 10:17</p>
 */
public class Presentation {
    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigModel();
        if (configModel.isNeedGenPresentation()) {
            System.out.println("正在生成表现层代码文件");
        }
    }
}
