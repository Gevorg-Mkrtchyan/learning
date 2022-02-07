package home.company.day5.task2;

public class Employee {
    int id;
    String name;
    String department;
    int age;
    char garden;

    public Employee(int id, String name, String department, int age, char garden) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.garden = garden;
    }

    public void write() {
        System.out.println("Employee id  = " + id + "Employee name = " + name + "Employee department "
                + department + " Employee age = " + age + "Employee garden =" + garden);
    }
}
