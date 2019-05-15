package art.yorm.design_patterns.behavior.strategy_pattern;

public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用立减促销策略，立减30元");
    }
}
