package banque;

/**
 * creates a compte child class in which we'll set a minimum $$ amount that has to remain on the account
 *
 */
public class CompteASeuil extends Compte implements ICompteASeuil{

    //attributes
    private double seuil;

    //constructor
    public CompteASeuil() {
    }
    public CompteASeuil(int accountNumber, double balance, double seuil) {
        super(accountNumber, balance);
        this.seuil = seuil;
    }

    //methods

    /**
     * checks if the client is allowed to withdraw
     * outputs a warning if needed
     * @param amount to withdraw
     */
    public void retirer(double amount) throws BanqueException{
        if ((balance - amount) > seuil) {
            balance -= amount;
        } else {
            throw new BanqueException("you aren't allowed to withdraw that much.");
        }
    }

    //g&s
    public double getSeuil() {
        return seuil;
    }
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", seuil=" + seuil +
                '}';
    }
}
