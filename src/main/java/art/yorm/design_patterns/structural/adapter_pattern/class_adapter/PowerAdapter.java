package art.yorm.design_patterns.structural.adapter_pattern.class_adapter;

public class PowerAdapter extends AC220V implements DC5V {
    @Override
    public int outputDC5V() {
        int output220V = output220V();
        int outputDC5V = output220V / 44;
        System.out.println("输入" + output220V + "V交流电，输出" + outputDC5V + "V直流电");
        return outputDC5V;
    }

}
