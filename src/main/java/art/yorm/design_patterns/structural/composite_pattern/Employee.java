package art.yorm.design_patterns.structural.composite_pattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Employee {
    private String name;
    private String department;
    private int salary;
    private List<Employee> subordinates;//下属

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public Employee addSubordinate(Employee employee) {
        this.subordinates.add(employee);
        return this;
    }

    public Employee removeSubordinate(Employee employee) {
        this.subordinates.remove(employee);
        return this;
    }
}
