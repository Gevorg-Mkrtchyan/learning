package home.company.day19.task3;

public class Marketing extends ItCompany {
    protected String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    protected void marketing() {
        System.out.println("marketing");
    }
}
