package home.company.day22;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 day22 = new Task1();
        System.out.println(day22.parseNumber());
    }

    public int parseNumber() {
        Scanner scanner = new Scanner(System.in);
        int result;
        while (true) {
            try {
                result = Integer.parseInt(scanner.nextLine());
                scanner.close();
                return result;
            } catch (NumberFormatException e) {
                System.out.println("try again");
            }
        }
    }
}
