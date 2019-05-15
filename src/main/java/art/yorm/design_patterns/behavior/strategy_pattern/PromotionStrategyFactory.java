package art.yorm.design_patterns.behavior.strategy_pattern;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> strategyMap = new HashMap<>(3);

    static {
        strategyMap.put("FANXIAN", new FanXianPromotionStrategy());
        strategyMap.put("MANJIAN", new ManJianPromotionStrategy());
        strategyMap.put("LIJIAN", new LiJianPromotionStrategy());
    }

    public static PromotionStrategy getStrategyMap(String promotionKey) {
        PromotionStrategy strategy = strategyMap.get(promotionKey);
        if (strategy == null){
            throw new RuntimeException("error promotionKey");
        }
        return strategy;
    }
}
