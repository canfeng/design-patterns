package art.yorm.design_patterns.structural.facade_pattern;

import java.util.UUID;

/**
 * 物流系统(子系统)
 */
public class LogisticsService {
    public String delivery(PointGift pointGift) {
        System.out.println("积分礼物【" + pointGift.getName() + "】已提交物流系统，准备发货");
        String orderNo = UUID.randomUUID().toString();
        return orderNo;
    }
}
