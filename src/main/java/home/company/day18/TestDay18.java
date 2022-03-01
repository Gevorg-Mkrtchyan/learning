package home.company.day18;

import home.company.day18.validator.PersonValidator;

import java.util.Scanner;

public class TestDay18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String passportId;
        String gender;
        int age;
        String nation;
        System.out.println("enter first name");
        while (true) {
            firstName = scanner.next();
            if (PersonValidator.validFirstName(firstName)) {
                break;
            } else {
                System.out.println("invalid firstName");
            }
        }
        System.out.println("enter LastName");
        while (true) {
            lastName = scanner.next();
            if (PersonValidator.validLastName(lastName)) {
                break;
            } else {
                System.out.println("invalid lastName");
            }
        }
        System.out.println("enter passportId");
        while (true){
            passportId = scanner.next();
            if (PersonValidator.validPassportId(passportId)){
                break;
            }
            else {
                System.out.println("invalid passportId");
            }
        }
        System.out.println("enter age");
        while (true){
            age = scanner.nextInt();
            if (PersonValidator.validAge(age)){
                break;
            }
            else {
                System.out.println("invalid age");
            }
        }
        System.out.println("enter gender");
        while (true){
            gender = scanner.next();
            if (PersonValidator.validGender(gender)){
                break;
            }
            else {
                System.out.println("invalid gender");
            }
        }
        nation = scanner.next();
        Person person = new Person(firstName,lastName,passportId,gender,age,nation);
        person.display(person);
//        Triangle triangle = new Triangle(2, 2, 3);
//        System.out.println(triangle.perimeter());
//        Store store = new Store(8, "city", "12222222"
//                , new String[]{"Bread", "potatoes", "mushrooms"});
//        System.out.println(store);
    }
}
