package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 10:19</p>
 */
public class Business {
    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigModel();
        if (configModel.isNeedGenBusiness()) {
            System.out.println("正在生成逻辑代码文件");
        }
    }
}
