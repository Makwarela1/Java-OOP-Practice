public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("123456", "John Doe", 2000);

        account1.deposit(0);
        account1.deposit(-200);
        account1.withdraw(10000);
        account1.deposit(500);
        account1.withdraw(300);
        account1.displayAccountDetails();
        /*
        Junior-developer challenge: Explain why making balance public would be a problem
        Making balance public in a real world scenario means that your balance would be accessible
        by anybody, and they can have access to change it as well.
         */

        Employee employee1 = new Employee("100001", "Sophia Smith", 15000);
        Employee employee2 = new Employee("100002", "Maria Jones", 22000);
        Employee employee3 = new Employee("100003", "Mark Johansen", 9500);

        System.out.println();
        employee1.displayPaySlip();
        employee1.increaseSalary(10);
        employee1.calcualteAnnualSalary();
        System.out.println();

        employee2.displayPaySlip();
        employee2.increaseSalary(5);
        employee2.increaseSalary(8);
        employee2.calcualteAnnualSalary();
        System.out.println();

        employee3.displayPaySlip();
        employee3.increaseSalary(0);
        employee3.calcualteAnnualSalary();





    }

}
