package art.yorm.design_patterns.structural.bridge_pattern;

/**
 * Refined Abstraction
 */
public class Square extends Shape {
    private int x;
    private int y;
    private int length;

    public Square(int x, int y, int length, Brush brush) {
        super(brush);
        this.x = x;
        this.y = y;
        this.length = length;
    }

    @Override
    public void draw() {
        brush.setColor();
        System.out.println("在(" + x + "," + y + ")的位置画一个边长为" + length + "正方形");
    }
}
