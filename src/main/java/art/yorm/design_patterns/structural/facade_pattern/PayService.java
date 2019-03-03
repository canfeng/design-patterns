package art.yorm.design_patterns.structural.facade_pattern;

/**
 * 积分支付系统(子系统)
 */
public class PayService {
    public boolean pay(PointGift pointGift) {
        System.out.println("积分礼物【" + pointGift.getName() + "】支付" + pointGift.getPoint() + "积分完成");
        return true;
    }
}
