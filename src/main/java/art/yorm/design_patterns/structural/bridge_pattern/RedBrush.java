package art.yorm.design_patterns.structural.bridge_pattern;

/**
 * ConcreteImplementor
 * 具体的实现
 */
public class RedBrush implements Brush {


    @Override
    public void setColor() {
        System.out.println("使用红色的画笔");
    }
}
