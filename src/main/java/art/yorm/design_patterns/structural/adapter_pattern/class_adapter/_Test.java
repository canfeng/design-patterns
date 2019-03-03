package art.yorm.design_patterns.structural.adapter_pattern.class_adapter;

/**
 * 类适配器模式
 */
public class _Test {
    public static void main(String[] args) {
        DC5V dc5V = new ConcreteDC5V();
        dc5V.outputDC5V();


        DC5V powerAdapter = new PowerAdapter();
        powerAdapter.outputDC5V();
    }
}
