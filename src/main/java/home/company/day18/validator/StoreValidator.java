package home.company.day18.validator;

public class StoreValidator {
    private StoreValidator() {

    }

    public static boolean validCountOfWorkers(int countOfWorkers) {
        return countOfWorkers >= 2 && countOfWorkers <= 50;
    }

    public static boolean validName(String name) {
        if (name == null || name.length() == 0) {
            return false;
        }
        int len = name.length();
        return len >= 3;
    }

    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.length() >= 8 && validNumber(phoneNumber);
    }

    public static boolean validNumber(String number) {
        if (number == null) {
            return false;
        }
        int len = number.length();
        for (int i = 0; i < len; i++) {
            if (number.charAt(i) <= '0' || number.charAt(i) >= '9') {
                return false;
            }
        }
        return true;
    }
}
