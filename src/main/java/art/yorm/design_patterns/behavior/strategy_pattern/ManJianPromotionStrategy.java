package art.yorm.design_patterns.behavior.strategy_pattern;

public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用满减促销策略，满500减200");
    }
}
