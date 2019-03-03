package art.yorm.design_patterns.structural.decorator_pattern;

public class BatterCakeEggDecorator extends BatterCakeDecorator {
    public BatterCakeEggDecorator(IBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String desc() {
        return super.desc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
