public class PermanentEmployee extends CompanyEmployees {
    private double medicalAidContribution;

    public PermanentEmployee(String empName, String empID, double baseSalary, double medicalAidContribution){
        super(empName, empID, baseSalary);
        this.medicalAidContribution = medicalAidContribution;
        setMedicalAidContribution(medicalAidContribution);
    }

    public double getMedicalAidContribution(){
        return medicalAidContribution;
    }

    public void setMedicalAidContribution(double medicalAidContribution){
        if(medicalAidContribution > 0 ){
            this.medicalAidContribution = medicalAidContribution;
        }
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Medical Aid Contribution: R" + getMedicalAidContribution());
    }



}
