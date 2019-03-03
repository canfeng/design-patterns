package art.yorm.design_patterns.structural.decorator_pattern;

public abstract class BatterCakeDecorator implements IBatterCake {

    protected IBatterCake batterCake;

    public BatterCakeDecorator(IBatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    public String desc() {
        return this.batterCake.desc();
    }

    @Override
    public int cost() {
        return this.batterCake.cost();
    }
}
