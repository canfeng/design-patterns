package art.yorm.design_patterns.behavior.state_pattern.no_transition;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常预警状态 上下文
 */
@Data
public class ErrorAlarmStateContext {

    private static final ErrorAlarmState LOW_LEVEL_STATE = new LowLevelErrorAlarmState();
    private static final ErrorAlarmState MEDIUM_LEVEL_STATE = new MediumLevelErrorAlarmState();
    private static final ErrorAlarmState HIGH_LEVEL_STATE = new HighLevelErrorAlarmState();

    private ErrorAlarmState curState;

    /**
     * 记录异常的发生次数
     */
    private Map<String, Integer> errorCountMap = new HashMap<>();

    /**
     * 发生异常
     */
    public void occurError(String error) {
        int errorCount = errorCountMap.getOrDefault(error,  0) + 1;
        errorCountMap.put(error, errorCount);
        if (errorCount >= 10) {
            this.curState = HIGH_LEVEL_STATE;
        } else if (errorCount >= 6) {
            this.curState = MEDIUM_LEVEL_STATE;
        } else if (errorCount >= 3) {
            this.curState = LOW_LEVEL_STATE;
        } else {
            System.out.println("不足以预警");
            return;
        }

        this.curState.alarm(error);
    }
}
