package art.yorm.design_patterns.behavior.observer_pattern;

/**
 * 观察者模式
 *
 * 当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。
 */
public class _Test {

    public static void main(String[] args) {
        Course course = new Course("计算机导论");

        Teacher teacher1 = new Teacher("lisa");
        Teacher teacher2 = new Teacher("mhan");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        course.productQuestion(new Question("szg", "请问老师，计算机以后的发展趋势是什么？"));
    }
}
