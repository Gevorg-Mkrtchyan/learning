package home.company.day19.task2;

public class Accounting {
    private String countOfEmployers;
    private String departmentName;

    public String getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(String countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    protected void account() {
        System.out.println("Accounting account");
    }

}
