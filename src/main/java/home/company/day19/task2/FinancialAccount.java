package home.company.day19.task2;

public class FinancialAccount extends TaxAccounting{
    private String countOfEmployers;
    private String departmentName;

    @Override
    public String getCountOfEmployers() {
        return countOfEmployers;
    }

    @Override
    public void setCountOfEmployers(String countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void account() {
        System.out.println(" calculate salryOfEployeers");
    }
}
