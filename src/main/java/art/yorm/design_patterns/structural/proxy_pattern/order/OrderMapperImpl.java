package art.yorm.design_patterns.structural.proxy_pattern.order;

public class OrderMapperImpl implements OrderMapper {
    @Override
    public int insert(Order order) {
        System.out.println("保存订单到数据库：" + order.toString());
        return 1;
    }
}
