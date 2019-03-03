package art.yorm.design_patterns.structural.facade_pattern;

/**
 * 外观模式
 */
public class _Test {

    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.exchangeGift(new PointGift() {{
            setName("JAVA EE互联网轻量级框架整合开发");
            setPoint(595);
        }});
    }
}
