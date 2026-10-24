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


    }

}
