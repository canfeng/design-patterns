package art.yorm.design_patterns.structural.proxy_pattern.order;

import art.yorm.design_patterns.structural.proxy_pattern.config.DataSourceContextHolder;

public class OrderServiceImpl implements OrderService {

    private OrderMapper orderMapper;

    public OrderServiceImpl() {
        this.orderMapper = new OrderMapperImpl();
    }

    @Override
    public int saveOrder(Order order) {
        System.out.println("current dataSourceId==>" + DataSourceContextHolder.getDataSource());
        return orderMapper.insert(order);
    }
}
