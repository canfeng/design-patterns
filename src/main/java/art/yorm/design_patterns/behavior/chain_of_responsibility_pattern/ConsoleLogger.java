package art.yorm.design_patterns.behavior.chain_of_responsibility_pattern;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    void write(String message) {
        System.out.println("ConsoleLogger out put==>" + message);
    }
}
