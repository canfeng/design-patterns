package art.yorm.design_patterns.structural.facade_pattern;

/**
 * 资格校验系统（子系统）
 */
public class QualifyService {
    public boolean qualify(PointGift pointGift) {
        System.out.println("积分礼物【" + pointGift.getName() + "】资格校验通过");
        return true;
    }
}
