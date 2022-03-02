package home.company.day19;

import home.company.day19.task1.Animal;
import home.company.day19.task1.Dog;
import home.company.day19.task2.Accounting;
import home.company.day19.task2.FinancialAccount;
import home.company.day19.task2.TaxAccounting;

public class TestDay19 {
    public static void main(String[] args) {
        //task1
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.eat();
        dog.voice();

        //task2
        Accounting accounting = new Accounting();
        TaxAccounting taxAccounting = new TaxAccounting();
        FinancialAccount financialAccount = new FinancialAccount();
        financialAccount.account();
        taxAccounting.account();



    }
}
