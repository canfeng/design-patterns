package art.yorm.design_patterns.structural.composite_pattern;

/**
 * 组合模式(树形结构)
 */
public class _Test {

    public static void main(String[] args) {
        Employee ceo = new Employee("SZG", "CEO", 1000000);

        Employee leaderMarket = new Employee("John", "市场部", 500000);
        Employee leaderSales = new Employee("Robert", "销售部", 500000);

        ceo.addSubordinate(leaderMarket).addSubordinate(leaderSales);

        Employee clerk1 = new Employee("Laura", "市场部", 10000);
        Employee clerk2 = new Employee("Bob", "市场部", 10000);

        leaderMarket.addSubordinate(clerk1).addSubordinate(clerk2);

        Employee sales1 = new Employee("Richard", "销售部", 20000);
        Employee sales2 = new Employee("Michel", "销售部", 20000);

        leaderSales.addSubordinate(sales1).addSubordinate(sales2);

        //打印该组织的所有员工
        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
