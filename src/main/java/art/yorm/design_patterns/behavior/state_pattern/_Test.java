package art.yorm.design_patterns.behavior.state_pattern;

/**
 * 状态模式
 *
 * demo场景描述：
 * 有一个触发预警的功能，每抛出一次异常，错误次数加1，当错误次数达到3次时，触发低级预警，预警方式：打印日志；达到6次时，触发中级预警：发送邮件；当达到10次时，触发高级预警：发送短信
 */
public class _Test {


    public static void main(String[] args) {

        ErrorAlarmStateContext errorAlarmStateContext = new ErrorAlarmStateContext();
        for (int i = 0; i < 10; i++) {
            errorAlarmStateContext.occurError("接口请求超时");
        }
    }
}
