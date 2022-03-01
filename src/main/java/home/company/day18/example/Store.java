package home.company.day18.example;

import java.util.Arrays;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private String[] productNumbers;

    public Store() {

    }

    public Store(int countOfWorkers, String name, String phoneNumber, String[] productNumbers) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.productNumbers = productNumbers;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
}
