package art.yorm.design_patterns.structural.proxy_pattern.config;

public class UserContextHolder {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void set(String userName) {
        threadLocal.set(userName);
    }

    public static String get() {
        return threadLocal.get();
    }

    public static void clear() {
        threadLocal.remove();
    }
}
