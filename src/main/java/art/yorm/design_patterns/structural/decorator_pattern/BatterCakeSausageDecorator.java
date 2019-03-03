package art.yorm.design_patterns.structural.decorator_pattern;

public class BatterCakeSausageDecorator extends BatterCakeDecorator {
    public BatterCakeSausageDecorator(IBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String desc() {
        return super.desc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
