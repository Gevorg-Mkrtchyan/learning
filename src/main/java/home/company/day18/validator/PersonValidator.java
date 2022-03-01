package home.company.day18.validator;

public final class PersonValidator {
    private PersonValidator() {

    }

    public static boolean validFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0) {
            return false;
        }
        int len = firstName.length();
        return len >= 3 && len <= 15;
    }

    public static boolean validLastName(String lastName) {
        if (lastName == null || lastName.length() == 0) {
            return false;
        }
        int len = lastName.length();
        return len >= 6 && len <= 20;
    }

    public static boolean validAge(int age) {
        return (age >= 18 && age <= 99);
    }

    public static boolean validGender(String gender) {
        return gender.compareToIgnoreCase("Male") == 0 || gender.compareToIgnoreCase("Female") == 0;
    }

    public static boolean validPassportId(String passportId) {
        int len = passportId.length();
        boolean isDigit = true;
        for (int i = 3; i < len - 2; i++) {
            if (passportId.charAt(i) < '0' || passportId.charAt(i) > '9') {
                isDigit = false;
                break;
            }
        }
        return passportId.substring(0, 2).equals("AN") && len == 8 && isDigit;
    }
}
