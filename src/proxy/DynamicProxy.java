package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/22 13:52</p>
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] clazz, InvocationHandler ih) {
        if (true) {
            new BeforeAdvice().exec();
        }
        return (T) Proxy.newProxyInstance(loader, clazz, ih);
    }
}
