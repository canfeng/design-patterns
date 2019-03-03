package art.yorm.design_patterns.structural.adapter_pattern.class_adapter;

public class ConcreteDC5V implements DC5V {
    @Override
    public int outputDC5V() {
        int output=5;
        System.out.println("输出"+output+"V交流电");
        return output;
    }
}
