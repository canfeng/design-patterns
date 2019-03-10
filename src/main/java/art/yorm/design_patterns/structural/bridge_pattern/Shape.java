package art.yorm.design_patterns.structural.bridge_pattern;

/**
 * Abstraction
 * 抽象
 */
public abstract class Shape {

    protected Brush brush;

    public Shape(Brush brush) {
        this.brush = brush;
    }

    public abstract void draw();
}
