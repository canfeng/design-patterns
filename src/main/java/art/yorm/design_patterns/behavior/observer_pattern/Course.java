package art.yorm.design_patterns.behavior.observer_pattern;

import lombok.Data;

import java.util.Observable;

/**
 * 被观察者
 */
@Data
public class Course extends Observable {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    /**
     * 提问
     */
    public void productQuestion(Question question){
        System.out.println("发出提问："+ question);
        setChanged();
        notifyObservers(question);
    }
}
