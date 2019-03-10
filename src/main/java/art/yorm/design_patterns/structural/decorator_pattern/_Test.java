package art.yorm.design_patterns.structural.decorator_pattern;

/**
 * 装饰器模式
 */
public class _Test {
    public static void main(String[] args) {

        IBatterCake batterCake = new BatterCake();

        BatterCakeDecorator eggDecorator1 = new BatterCakeEggDecorator(batterCake);
        BatterCakeDecorator eggDecorator2 = new BatterCakeEggDecorator(eggDecorator1);
        BatterCakeDecorator sausageDecorator1 = new BatterCakeSausageDecorator(eggDecorator2);
        BatterCakeDecorator sausageDecorator2 = new BatterCakeSausageDecorator(sausageDecorator1);

        System.out.println("decs: " + sausageDecorator2.desc() + "; cost: " + sausageDecorator2.cost());
    }
}
