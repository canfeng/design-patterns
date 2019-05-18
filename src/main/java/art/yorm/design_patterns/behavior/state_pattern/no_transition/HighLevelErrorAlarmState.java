package art.yorm.design_patterns.behavior.state_pattern.no_transition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HighLevelErrorAlarmState implements ErrorAlarmState {
    @Override
    public void alarm(String error) {
        System.out.println("高级预警：发送短信如下：");
        log.error("接收号码：{}; 程序出现异常==>{}，请紧急处理！", "15115115111", error);
    }
}
