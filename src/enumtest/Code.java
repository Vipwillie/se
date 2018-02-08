package enumtest;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/6/2716:37</p>
 */
public enum Code {
    CODE_001(111, "aaa"), CODE_002(222, "bbb");
    private int code;
    private String name;

    Code(int i, String aaa) {
        this.code = i;
        this.name = aaa;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static String getName(int code) {
        for (Code c : Code.values()) {
            if (c.getCode() == code) {
                return c.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
