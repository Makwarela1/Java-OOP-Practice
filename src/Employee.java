public class Employee {
    private String employeeId;
    private String name;
    private double monthlySalary;
    private double salaryIncrease;
    private double totalSalaryIncrease =0;


    public Employee(String employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }


    public void increaseSalary(double percentage) {
        if (percentage <= 0) {
            System.out.println("Invalid Percentage Increase");
        } else {
            salaryIncrease = monthlySalary * percentage / 100;
            totalSalaryIncrease += salaryIncrease;
            monthlySalary = monthlySalary + salaryIncrease;

            System.out.println("Monthly Salary Increase Amount: R" + salaryIncrease);
            System.out.println( "New Monthly Salary: R" + monthlySalary);
            System.out.println("Cummalative Salary Increase: R" + totalSalaryIncrease);
        }
    }

    public void calcualteAnnualSalary() {
        double annualSalary;
        annualSalary = monthlySalary * 12;
        System.out.printf("Annual Salary: R%.2f%n", annualSalary); // convert annual salary to 2 decimal points
    }

    public void displayPaySlip() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Current Monthly Salary: R" + getMonthlySalary());

    }
}