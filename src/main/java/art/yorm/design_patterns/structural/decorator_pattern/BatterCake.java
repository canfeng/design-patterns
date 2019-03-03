package art.yorm.design_patterns.structural.decorator_pattern;

public class BatterCake implements IBatterCake {
    @Override
    public String desc() {
        return "要一个煎饼";
    }

    @Override
    public int cost() {
        return 5;
    }
}
