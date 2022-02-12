package home.company.day5.task2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Jhon", "programing", 25, 'm');
        Employee employee2 = new Employee(1, "Bob", "programing", 24, 'm');
        Employee employee3 = new Employee(1, "Rob", "accounting", 21, 'm');
        Employee employee4 = new Employee(1, "Jenifer", "accounting", 52, 'f');
        Employee employee5 = new Employee(1, "Qim", "programing", 21, 'f');
        employee1.allInfoEmployee();
        employee2.allInfoEmployee();
        employee3.allInfoEmployee();
        employee4.allInfoEmployee();
        employee5.allInfoEmployee();
    }
}
