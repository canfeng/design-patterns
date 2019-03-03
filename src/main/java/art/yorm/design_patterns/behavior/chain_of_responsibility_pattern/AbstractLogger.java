package art.yorm.design_patterns.behavior.chain_of_responsibility_pattern;

/**
 * 抽象日志类
 */
public abstract class AbstractLogger {

    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;

    /**
     * 日志等级
     */
    protected int level;

    /**
     * 责任链的下一个元素
     */
    protected AbstractLogger nextLogger;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int level, String message) {
        if (this.level >= level) {
            this.write(message);
        }
        if (nextLogger != null) { // 此处非空判断必不可少，因为责任链最后一个元素没有nextLogger
            nextLogger.log(level, message);
        }
    }

    abstract void write(String message);
}
