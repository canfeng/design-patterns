package art.yorm.design_patterns.behavior.chain_of_responsibility_pattern;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        super(level);
    }

    @Override
    void write(String message) {
        System.out.println("FileLogger out put==>" + message);
    }
}
