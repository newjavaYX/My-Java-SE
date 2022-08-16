package d15_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgentProxy {
    public static Skill getSkill(Object agent){
        return (Skill) Proxy.newProxyInstance(agent.getClass().getClassLoader(), agent.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {//但代理对象调用被代理对象的方法时，程序会来到这里
                //Method为代理对象调用的被代理对象的方法，args为方法的参数
                //return返回的是方法的返回值
                System.out.println("代理调用了"+method.getName());
                return method.invoke(agent,args);
            }
        });

    }
 }
