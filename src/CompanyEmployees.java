public class CompanyEmployees {
    private String empName;
    private String empID;
    private double baseSalary;

    public CompanyEmployees(String empName, String empID, double baseSalary) {
//        this.empName = empName;
//        this.empID = empID;
//        this.baseSalary = baseSalary;

        setEmpName(empName);
        setEmpID(empID);
        setBaseSalary(baseSalary);
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpID() {
        return empID;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setEmpName(String empName) {
        if (empName != null && !empName.isEmpty()) {
            this.empName = empName;
        }
    }

    public void setEmpID(String empID) {
        if (empID != null && !empID.isEmpty()) {
            this.empID = empID;
        }
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Base Salary: " + getBaseSalary());
    }
}