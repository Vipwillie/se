package proxy;

import org.apache.poi.ss.formula.functions.T;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/22 13:38</p>
 */
public class GamePlayIH implements InvocationHandler {
    private Class<T> clazz;

    private Object obj;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("login".equals(method.getName())) {
            System.out.println("有人在用我的帐号登录!");
        }
        return method.invoke(obj, args);
    }
}
