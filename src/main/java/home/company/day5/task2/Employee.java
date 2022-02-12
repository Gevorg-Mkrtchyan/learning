package home.company.day5.task2;

/**
 * 2. Define Employee class which
 *  Has fields id, name, department, age, gender
 *  define all argument constructor
 *  write method which will print all information about employee
 *  create 5 employee objects(3 male and 2 female)
 *  3 of them are working in same department
 *  print all info about them
 */
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

    public void allInfoEmployee() {
        System.out.println("Employee id  = " + id + "Employee name = " + name + "Employee department "
                + department + " Employee age = " + age + "Employee garden =" + garden);
    }
}
