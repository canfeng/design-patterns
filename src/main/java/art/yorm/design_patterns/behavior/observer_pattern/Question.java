package art.yorm.design_patterns.behavior.observer_pattern;


import lombok.Data;

@Data
public class Question {

    private String userName;
    private String content;

    public Question(String userName, String content) {
        this.userName = userName;
        this.content = content;
    }
}
