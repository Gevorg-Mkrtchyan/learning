package home.company.day5.task1;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Jone",21,"Erevan");
        person1.write();
        person2.write();
    }
}
