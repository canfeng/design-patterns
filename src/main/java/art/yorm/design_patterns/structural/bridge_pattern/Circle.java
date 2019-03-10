package art.yorm.design_patterns.structural.bridge_pattern;

/**
 * Refined Abstraction
 * 具体抽象
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, Brush brush) {
        super(brush);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        brush.setColor();
        System.out.println("在(" + x + "," + y + ")的位置画一个半径为" + radius + "圆");
    }
}
