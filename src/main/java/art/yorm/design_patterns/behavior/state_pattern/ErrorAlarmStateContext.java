package art.yorm.design_patterns.behavior.state_pattern;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常预警状态 上下文
 */
@Data
public class ErrorAlarmStateContext {

    private ErrorAlarmState curState;

    /**
     * 记录异常的发生次数
     */
    private Map<String, Integer> errorCountMap = new HashMap<>();

    /**
     * 发生异常
     */
    public void occurError(String error) {
        int errorCount = errorCountMap.getOrDefault("error", 0) + 1;
        errorCountMap.put(error, errorCount);
        if (errorCount >= 10) {
            this.curState =
        } else if (errorCount >= 6){

        } else if (errorCount >= 3){

        }
    }
}
