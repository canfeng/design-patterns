package art.yorm.design_patterns.structural.proxy_pattern.static_proxy;

import art.yorm.design_patterns.structural.proxy_pattern.order.Order;
import art.yorm.design_patterns.structural.proxy_pattern.order.OrderService;
import art.yorm.design_patterns.structural.proxy_pattern.order.OrderServiceImpl;
import art.yorm.design_patterns.structural.proxy_pattern.config.DataSourceContextHolder;

public class OrderServiceStaticProxy implements OrderService {
    private OrderService orderSerive;

    public OrderServiceStaticProxy() {
        this.orderSerive = new OrderServiceImpl();
    }

    @Override
    public int saveOrder(Order order) {
        before(order);
        int result = orderSerive.saveOrder(order);
        after();
        return result;
    }

    public void before(Order order) {
        System.out.println("before advice run");
        int dsId = order.getUserId() % 2;
        DataSourceContextHolder.setDataSource("dataSource" + dsId);
    }

    public void after() {
        System.out.println("after advice run");
        DataSourceContextHolder.clear();
    }
}
