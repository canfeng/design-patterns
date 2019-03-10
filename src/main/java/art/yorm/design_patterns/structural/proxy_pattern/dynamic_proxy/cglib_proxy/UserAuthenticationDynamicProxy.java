package art.yorm.design_patterns.structural.proxy_pattern.dynamic_proxy.cglib_proxy;

import art.yorm.design_patterns.structural.proxy_pattern.config.UserContextHolder;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserAuthenticationDynamicProxy implements MethodInterceptor {
    private Object target;

    public UserAuthenticationDynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if (!before(args)) {
            return null;
        }
        Object result = proxy.invokeSuper(obj, args);
        after();
        return result;
    }

    private void after() {
        UserContextHolder.clear();
    }

    private boolean before(Object[] args) {
        if (!"szg".equals(UserContextHolder.get())) {
            System.out.println("您没有权限访问该用户的信息");
            return false;
        }
        return true;
    }

    public Object newProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
}
