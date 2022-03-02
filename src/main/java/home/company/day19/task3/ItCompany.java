package home.company.day19.task3;

public class ItCompany {
    protected String countOfEmployers;
    private String companyName;

    public String getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(String countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    protected void account() {
        System.out.println("ItCompany");
    }
}
