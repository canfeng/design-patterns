package art.yorm.design_patterns.structural.proxy_pattern.dynamic_proxy.jdk_proxy;

import art.yorm.design_patterns.structural.proxy_pattern.order.Order;
import art.yorm.design_patterns.structural.proxy_pattern.order.OrderServiceImpl;
import art.yorm.design_patterns.structural.proxy_pattern.order.OrderService;

import java.util.UUID;

/**
 * 代理模式-JDK动态代理
 */
public class _Test {

    public static void main(String[] args) {

        OrderService orderServiceProxy = (OrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).newProxyInstance();
        int res1 = orderServiceProxy.saveOrder(new Order() {{
            setOrderNo(UUID.randomUUID().toString());
            setUserId(101);
        }});
        System.out.println("保存结果：" + res1);
        System.out.println("______________________________");
        int res2 = orderServiceProxy.saveOrder(new Order() {{
            setOrderNo(UUID.randomUUID().toString());
            setUserId(102);
        }});
        System.out.println("保存结果：" + res2);
    }
}
