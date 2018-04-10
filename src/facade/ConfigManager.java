package facade;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/9 10:14</p>
 */
public class ConfigManager {
    private static ConfigManager manager;
    private static ConfigModel configModel;

    private ConfigManager() {
    }

    public static ConfigManager getInstance() {
        if (manager == null) {
            manager = new ConfigManager();
            configModel = new ConfigModel();
        }
        return manager;
    }

    public ConfigModel getConfigModel() {
        return configModel;
    }
}
