package art.yorm.design_patterns.behavior.strategy_pattern;

import lombok.Data;

@Data
public class PromotionActivity {

    private String name;
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(String name) {
        this.name = name;
    }

    public void startActivity() {
        System.out.println("活动开始==>" + name);
        promotionStrategy.doPromotion();
    }
}
