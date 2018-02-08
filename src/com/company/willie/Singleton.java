package com.company.willie;

/**
 * <p>功能 描述:单例设计模式</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/4/113:56</p>
 */
class Singleton {
    /**
     * 懒汉式单例
     */
    private static Singleton singleton;

    private Singleton() {

    }

    /**
     * 取得实例
     *
     * @return Singleton
     */
    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}

class A {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        long after = System.currentTimeMillis();
        System.out.println(after-before);
        System.out.println(singleton == singleton1);
        System.out.println(singleton.equals(singleton1));
    }
}
