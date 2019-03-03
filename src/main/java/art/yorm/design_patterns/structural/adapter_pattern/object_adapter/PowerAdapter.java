package art.yorm.design_patterns.structural.adapter_pattern.object_adapter;

public class PowerAdapter implements DC5V {
    private AC220V ac220V = new AC220V();
    @Override
    public int outputDC5V() {
        int output220V = ac220V.output220V();
        int outputDC5V = output220V / 44;
        System.out.println("输入" + output220V + "V交流电，输出" + outputDC5V + "V直流电");
        return outputDC5V;
    }

}
