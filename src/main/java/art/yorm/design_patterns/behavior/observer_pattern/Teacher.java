package art.yorm.design_patterns.behavior.observer_pattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
@Data
@Slf4j
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        log.info("老师:{}- 您收到了关于课程【{}】的提问：{}" , name, course.getName(), question);
    }
}
