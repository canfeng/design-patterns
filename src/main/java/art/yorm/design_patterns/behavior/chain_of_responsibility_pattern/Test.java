package art.yorm.design_patterns.behavior.chain_of_responsibility_pattern;

public class Test {

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.log(AbstractLogger.DEBUG, "测试消息1");
        loggerChain.log(AbstractLogger.INFO, "测试消息2");
        loggerChain.log(AbstractLogger.ERROR, "测试消息3");

    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        //指定责任链的顺序
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        return consoleLogger;
    }
}
