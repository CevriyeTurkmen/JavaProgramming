package day35_Encapsulation;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) { // -1
        if (amount <= 0) {
            System.err.println("Depositing amount can not be negative or zero");
            System.exit(1);
        }

        System.out.println("Depositing $" + amount + " to the account " + accountNumber);
        balance += amount;


    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.err.println("Withdrawing amount can not be negative or zero");
            System.exit(1);
        }

        if(balance <= 0){
            System.err.println("Insufficient balance");
            System.exit(1);
        }

        System.out.println("Withdrawing $"+amount+" from the account "+accountNumber);
        balance -= amount;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }

}




