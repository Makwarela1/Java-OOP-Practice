public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("123456", "John Doe", 2000);

        account1.displayAccountDetails();
        account1.deposit(500);
        account1.withdraw(1000);



    }

}
