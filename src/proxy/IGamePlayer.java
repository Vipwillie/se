package proxy;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/22 13:33</p>
 */
public interface IGamePlayer {
    /**
     * 登录
     *
     * @param user     帐号
     * @param password 密码
     */
    void login(String user, String password);

    /**
     * 大boss
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}
