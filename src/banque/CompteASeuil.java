package banque;

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
    public void retirer(double amount){
        if ((balance - amount) > seuil) {
            balance -= amount;
        } else {
            System.out.println("you aren't allowed to withdraw that much.");
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
