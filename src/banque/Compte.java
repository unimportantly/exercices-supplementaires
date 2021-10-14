package banque;

public class Compte {

    //attributes
    int accountNumber;
    double balance;

    //constructors
    public Compte(){}
    public Compte(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //methods
    public void deposit(double amount){
        setBalance(getBalance()+amount);
    }
    public void getCash(double amount){
        setBalance((getBalance()-amount));
    }
    //s&g

    public int getAccountNumber() {
        return accountNumber;
    }
    protected void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
