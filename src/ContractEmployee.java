public class ContractEmployee extends CompanyEmployees {
    private int contractDuration;

    public ContractEmployee(String empName, String empID, double baseSalary, int contractDuration){
        super(empName, empID, baseSalary);
        this.contractDuration = contractDuration;
        setContractDuration(contractDuration);
    }

    public int getContractDuration(){
        return contractDuration;
    }

    public void setContractDuration(int contractDuration){
        this.contractDuration = contractDuration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Contract Duration: " + getContractDuration() + " months");;
    }
}
