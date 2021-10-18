package banque;

/**
 * create a parent class compte with an ID & balance
 */
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
        setBalance(this.getBalance()+amount);
    }

    /**
     * withdraw money
     * @param amount
     * @throws BanqueException if tries to withdraw too much
     */
    public void retirer(double amount) throws BanqueException {
        if (this.getBalance() < amount){
            throw new BanqueException("You don't have enough money for that");
        }
        setBalance((this.getBalance()-amount));
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
