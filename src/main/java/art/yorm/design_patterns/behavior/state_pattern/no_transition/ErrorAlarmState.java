package art.yorm.design_patterns.behavior.state_pattern.no_transition;

/**
 * 异常预警状态
 */
public interface ErrorAlarmState {

    void alarm(String error);
}
