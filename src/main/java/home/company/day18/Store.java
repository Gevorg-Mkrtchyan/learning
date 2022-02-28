package home.company.day18;

import java.util.Arrays;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private String[] productNumbers;

    public Store() {

    }

    public Store(int countOfWorkers, String name, String phoneNumber, String[] productNumbers) {
        this.setCountOfWorkers(countOfWorkers);
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.productNumbers = productNumbers;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers < 2 || countOfWorkers > 50) {
            System.out.println("invalid countOfWorkers");
        } else {
            this.countOfWorkers = countOfWorkers;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2) {
            System.out.println("invalid name");
        } else {
            this.name = name;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() < 8 || !isNum(phoneNumber)) {
            System.out.println("invalid phoneNumber");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String[] getProductNumbers() {
        return productNumbers;
    }

    public void setProductNumbers(String[] productNumbers) {
        this.productNumbers = productNumbers;
    }

    @Override
    public String toString() {
        return "Store{" +
                "countOfWorkers=" + countOfWorkers +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", productNumbers=" + Arrays.toString(productNumbers) +
                '}';
    }

    private boolean isNum(String num) {
        for (int i = 0; i < 8; i++) {
            if ((num.charAt(i) <= '0' || num.charAt(i) >= '9')) {
                return false;
            }
        }
        return true;
    }
}
