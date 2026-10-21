public class Employee {
    private String employeeId;
    private String name;
    private double monthlySalary;

    Employee (String employeeId, String  name, double monthlySalary){
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getEmployeeId(){return employeeId;}
    public String getName(){return name;}
    public double getMonthlySalary(){return monthlySalary;}



}
