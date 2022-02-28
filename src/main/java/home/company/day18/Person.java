package home.company.day18;

/**
 * Write a Person.java class which `
 * -        has private fields firstName, lastName, passportId, age, gender(String), nationality.
 * -        add all argument constructor, and no argument constructor.
 * -        add public  getters and setters.
 * -        has a display() method which will give all information about the person. Example`  firstName is Armen
 * lastName is Meliqyan            etc…
 * <p>
 * <p>
 * 2.Add in Person class validations with getters and setters with following options
 * -        firstName must be in range 3 to 15
 * -        lastName must be in range 6 to 20
 * -        age must be in range 18 - 99
 * -        gender must be male or female(compareToIgnoreCase())
 * -        passportId must be start with “AN” and contain 6 digits with length 8
 */
public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private String gender;
    private int age;
    private String nation;

    public Person() {

    }

    public Person(String firstName, String lastName, String passportId, String gender, int age, String nation) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPassportId(passportId);
        this.setGender(gender);
        this.setAge(age);
        this.nation = nation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 15) {
            System.out.println("invalid firstName");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 6 || lastName.length() > 20) {
            System.out.println("invalid lastName");
        } else {
            this.lastName = lastName;
        }
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        int len = passportId.length();
        boolean isDigit = true;
        for (int i = 3; i < len - 2; i++) {
            if (passportId.charAt(i) < '0' || passportId.charAt(i) > '9') {
                isDigit = false;
                break;
            }
        }
        if (passportId.substring(0, 2).equals("AN") && len == 8 && isDigit) {
            this.passportId = passportId;
        } else {
            System.out.println("Invalid passport ID");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.compareToIgnoreCase("Male") != 0 && gender.compareToIgnoreCase("Female") != 0) {
            System.out.println("invalid gender");
        } else {
            this.gender = gender;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 99) {
            System.out.println("invalid age");
        } else {
            this.age = age;
        }
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportId='" + passportId + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }

    public void display(Person person) {
        System.out.println(person.toString());
    }
}
