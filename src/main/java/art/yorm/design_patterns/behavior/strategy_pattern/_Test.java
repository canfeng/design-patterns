package art.yorm.design_patterns.behavior.strategy_pattern;

/**
 * 策略模式
 */
public class _Test {

    public static void main(String[] args) {
        PromotionActivity activity51 = new PromotionActivity("5.1活动");
        String promotionKey = "MANJIAN";

        /***
         * if...else 写法
         */
//        if ("LIJIAN".equalsIgnoreCase(promotionKey)) {
//            activity51.setPromotionStrategy(new LiJianPromotionStrategy());
//        } else if ("MANJIAN".equalsIgnoreCase(promotionKey)) {
//            activity51.setPromotionStrategy(new ManJianPromotionStrategy());
//        } else if ("FANXIAN".equalsIgnoreCase(promotionKey)) {
//            activity51.setPromotionStrategy(new FanXianPromotionStrategy());
//        }

        /**
         * 策略模式 + 工厂模式写法
         */
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getStrategyMap(promotionKey);
        activity51.setPromotionStrategy(promotionStrategy);
        activity51.startActivity();
}
}
