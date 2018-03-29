package enumtest;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/3/29 14:28</p>
 */
public enum RequestMethod {
    GET("GET"), POST("POST"), PUT("");
    private String methodName;

    RequestMethod(String methodName) {
        this.methodName = methodName;
    }
}
