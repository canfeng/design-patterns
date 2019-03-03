package art.yorm.design_patterns.structural.facade_pattern;


/**
 * 积分礼物兑换系统（外观类）
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PayService payService = new PayService();
    private LogisticsService logisticsService = new LogisticsService();

    public void exchangeGift(PointGift pointGift) {
        if (qualifyService.qualify(pointGift)) {
            if (payService.pay(pointGift)) {
                String orderNo = logisticsService.delivery(pointGift);
                System.out.println("积分礼物【" + pointGift.getName() + "】兑换成功，物流订单编号：" + orderNo);
            }
        }
    }
}
