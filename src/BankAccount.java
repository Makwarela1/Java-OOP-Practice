public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount( String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit (double amount){
        if (amount >= 0){
            balance = balance + amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Deposit unsuccessful");
        }
    }

    public void withdraw(double amount){
        if (amount >= 0 && amount > balance){
            balance = balance - amount;
        }
    }

    public void displayAccountDetails(){
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balance: " + balance);
    }



}
