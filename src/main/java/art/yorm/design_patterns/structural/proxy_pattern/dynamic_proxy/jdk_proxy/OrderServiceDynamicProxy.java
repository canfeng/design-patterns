package art.yorm.design_patterns.structural.proxy_pattern.dynamic_proxy.jdk_proxy;

import art.yorm.design_patterns.structural.proxy_pattern.order.Order;
import art.yorm.design_patterns.structural.proxy_pattern.config.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {
    /**目标对象*/
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    public Object newProxyInstance(){
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), target.getClass().getInterfaces(), this);
    }

    public void before(Object arg) {
        System.out.println("before advice run");
        if (arg instanceof Order) {
            int dsId = ((Order) arg).getUserId() % 2;
            DataSourceContextHolder.setDataSource("dataSource" + dsId);
        }
    }

    public void after() {
        System.out.println("after advice run");
        DataSourceContextHolder.clear();
    }
}
