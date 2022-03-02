package home.company.day19.task3;

public class TestTask3 {
    public static void main(String[] args) {
        ItCompany itCompany = new ItCompany();
        Accounting accounting = new Accounting();
        Accounting taxAccounting = new TaxAccounting();
        Accounting financialAccount = new FinancialAccount();
        Marketing marketing = new Marketing();
        Marketing smm = new SMM();
        Marketing seo = new SEO();
        itCompany.account();
        accounting.account();
        taxAccounting.account();
        financialAccount.account();
        marketing.marketing();
        smm.marketing();
        seo.marketing();

    }
}
