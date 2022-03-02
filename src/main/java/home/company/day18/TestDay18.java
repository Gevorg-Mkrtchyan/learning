package home.company.day18;

import home.company.day18.example.Person;
import home.company.day18.example.Store;
import home.company.day18.example.Triangle;
import home.company.day18.validator.PersonValidator;
import home.company.day18.validator.StoreValidator;
import home.company.day18.validator.TriangleValidator;

import java.util.Scanner;

public class TestDay18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task1,2
        int age;
        String firstName;
        String lastName;
        String passportId;
        String gender;
        String nation;
        System.out.println("enter first name");
        while (true) {
            firstName = scanner.next();
            if (PersonValidator.validFirstName(firstName)) {
                break;
            } else {
                System.out.println("invalid firstName try again");
            }
        }
        System.out.println("enter LastName");
        while (true) {
            lastName = scanner.next();
            if (PersonValidator.validLastName(lastName)) {
                break;
            } else {
                System.out.println("invalid lastName try again");
            }
        }
        System.out.println("enter passportId");
        while (true) {
            passportId = scanner.next();
            if (PersonValidator.validPassportId(passportId)) {
                break;
            } else {
                System.out.println("invalid passportId try again");
            }
        }
        System.out.println("enter age");
        while (true) {
            age = scanner.nextInt();
            if (PersonValidator.validAge(age)) {
                break;
            } else {
                System.out.println("invalid age try again");
            }
        }
        System.out.println("enter gender");
        while (true) {
            gender = scanner.next();
            if (PersonValidator.validGender(gender)) {
                break;
            } else {
                System.out.println("invalid gender try again");
            }
            System.out.println("enter nation");
            nation = scanner.next();
            Person person = new Person(firstName, lastName, passportId, gender, age, nation);
            person.display(person);

            //task3
            int sideA;
            int sideB;
            int sideC;
            System.out.println("enter sideA");
            while (true) {
                sideA = scanner.nextInt();
                if (TriangleValidator.validSide(sideA)) {
                    break;
                } else {
                    System.out.println("invalid sideA try again");
                }
            }
            System.out.println("enter sideB");
            while (true) {
                sideB = scanner.nextInt();
                if (TriangleValidator.validSide(sideB)) {
                    break;
                } else {
                    System.out.println("invalid sideB try again");
                }
            }
            System.out.println("enter sideC");
            while (true) {
                sideC = scanner.nextInt();
                if (TriangleValidator.validSide(sideC)) {
                    break;
                } else {
                    System.out.println("invalid sideC try again");
                }
            }
            Triangle triangle = new Triangle();
            System.out.println(triangle.perimeterOfArea(sideA, sideC));
            System.out.println(triangle.perimeterOfArea(sideA, sideB, sideC));
        }
        //task 4
        int countOfWorkers;
        String name;
        String phoneNumber;
        String[] productNumbers;
        System.out.println("enter countOfWorkers");
        while (true) {
            countOfWorkers = scanner.nextInt();
            if (StoreValidator.validCountOfWorkers(countOfWorkers)) {
                break;
            } else {
                System.out.println("invalid countOfWorkers try again");
            }
        }
        System.out.println("enter name");
        while (true) {
            name = scanner.next();
            if (StoreValidator.validName(name)) {
                break;
            } else {
                System.out.println("invalid name try again");
            }
        }
        System.out.println("enter phoneNumber");
        while (true) {
            phoneNumber = scanner.next();
            if (StoreValidator.validPhoneNumber(phoneNumber)) {
                break;
            } else {
                System.out.println("invalid phoneNumber try again");
            }
        }

        Store store = new Store(countOfWorkers, name, phoneNumber, new String[]{"Bread", "potatoes", "mushrooms"});
        System.out.println(store);
    }
}

