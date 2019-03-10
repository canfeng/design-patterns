package art.yorm.design_patterns.structural.bridge_pattern;

/**
 * 桥接模式
 */
public class _Test {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedBrush());
        Shape greenCircle = new Circle(100, 100, 20, new GreenBrush());
        Shape greenSquare = new Square(30, 22, 20, new GreenBrush());

        redCircle.draw();
        greenCircle.draw();
        greenSquare.draw();
    }

}
