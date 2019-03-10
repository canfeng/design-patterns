package art.yorm.design_patterns.structural.bridge_pattern;

/**
 * ConcreteImplementor
 */
public class GreenBrush implements Brush {

    @Override
    public void setColor() {
        System.out.println("使用绿色的画笔");
    }
}
