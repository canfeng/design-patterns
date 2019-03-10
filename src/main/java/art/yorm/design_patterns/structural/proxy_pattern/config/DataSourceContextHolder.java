package art.yorm.design_patterns.structural.proxy_pattern.config;

public class DataSourceContextHolder {

    private static ThreadLocal<String> dataSourceThreadLocal = new ThreadLocal<>();

    public static void setDataSource(String dataSourceId) {
        dataSourceThreadLocal.set(dataSourceId);
    }

    public static String getDataSource() {
        return dataSourceThreadLocal.get();
    }

    public static void clear() {
        dataSourceThreadLocal.remove();
    }

}
