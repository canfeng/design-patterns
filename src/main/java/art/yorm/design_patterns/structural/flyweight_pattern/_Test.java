package art.yorm.design_patterns.structural.flyweight_pattern;

/**
 * 享元模式
 * <p>
 * - 应用场景：
 * 1. 动态dubbo服务实现，DubboConfig的实例化
 * 2. Integer.valueOf() -> IntegerCache（-128-127）; LongCache ; String的字符串常量池
 */
public class _Test {
    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
