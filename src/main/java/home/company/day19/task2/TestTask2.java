package home.company.day19.task2;

public class TestTask2 {
    public static void main(String[] args) {
        Accounting accounting = new Accounting();
        Accounting financialAccounting = new FinancialAccount();
        Accounting taxAccounting = new TaxAccounting();
        accounting.account();
        financialAccounting.account();
        taxAccounting.account();
    }
}
