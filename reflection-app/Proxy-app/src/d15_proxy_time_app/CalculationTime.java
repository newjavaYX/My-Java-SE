package d15_proxy_time_app;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculationTime {
    public static <T> T Getproxy(T t) {
        return (T)Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long l = System.currentTimeMillis();
                Object invoke = method.invoke(t, args);
                long l1 = System.currentTimeMillis();
                System.out.println(method.getName()+"方法耗时"+(l1-l)/1000.0+"s");
                return invoke;
            }
        });
    }
}
