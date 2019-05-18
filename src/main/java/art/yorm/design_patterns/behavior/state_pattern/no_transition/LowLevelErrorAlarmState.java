package art.yorm.design_patterns.behavior.state_pattern.no_transition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LowLevelErrorAlarmState implements ErrorAlarmState {
    @Override
    public void alarm(String error) {
        System.out.println("低级预警：打印错误日志如下：");
        log.error("程序出现异常==>{}", error);
    }
}
