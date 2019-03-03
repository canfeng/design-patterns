package art.yorm.design_patterns.behavior.chain_of_responsibility_pattern;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    void write(String message) {
        System.out.println("ErrorLogger out put==>" + message);
    }
}
