package art.yorm.design_patterns.structural.proxy_pattern.static_proxy;

import art.yorm.design_patterns.structural.proxy_pattern.order.Order;
import art.yorm.design_patterns.structural.proxy_pattern.order.OrderService;

import java.util.UUID;

/**
 * 代理模式-静态代理
 */
public class _Test {

    public static void main(String[] args) {
        OrderService orderSeriveProxy = new OrderServiceStaticProxy();
        int res1 = orderSeriveProxy.saveOrder(new Order() {{
            setOrderNo(UUID.randomUUID().toString());
            setUserId(101);
        }});
        System.out.println("保存结果：" + res1);
        System.out.println("______________________________");
        int res2 = orderSeriveProxy.saveOrder(new Order() {{
            setOrderNo(UUID.randomUUID().toString());
            setUserId(102);
        }});
        System.out.println("保存结果：" + res2);
    }
}
