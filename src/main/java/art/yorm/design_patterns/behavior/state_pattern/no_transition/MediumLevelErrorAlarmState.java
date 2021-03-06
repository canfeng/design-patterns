package art.yorm.design_patterns.behavior.state_pattern.no_transition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MediumLevelErrorAlarmState implements ErrorAlarmState {
    @Override
    public void alarm(String error) {
        System.out.println("中级预警：发送报警邮件如下：");
        log.info("收件人：{}; 中级预警：程序出现异常==>{}; 请及时处理！", "614587600@qq.com", error);
    }
}
