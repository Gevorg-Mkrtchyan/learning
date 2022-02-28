package home.company.day18;

public class TestDay18 {
    public static void main(String[] args) {
        Person person = new Person("John", "Smith"
                , "Ap123456", "male", 21, "America");
        person.display(person);
        Triangle triangle = new Triangle(2, 2, 3);
        System.out.println(triangle.perimeter());
        Store store = new Store(8, "city", "12222222"
                , new String[]{"Bread", "potatoes", "mushrooms"});
        System.out.println(store);
    }
}
