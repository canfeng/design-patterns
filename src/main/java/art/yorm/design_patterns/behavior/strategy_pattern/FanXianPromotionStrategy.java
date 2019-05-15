package art.yorm.design_patterns.behavior.strategy_pattern;

public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用返现促销策略，满200送20元代金券");
    }
}
