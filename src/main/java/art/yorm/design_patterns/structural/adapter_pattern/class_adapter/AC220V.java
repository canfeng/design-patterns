package art.yorm.design_patterns.structural.adapter_pattern.class_adapter;

/**
 * 被适配者
 */
public class AC220V {
    public int output220V() {
        int output = 220;
        System.out.println("输出" + output + "V交流电");
        return output;
    }
}
