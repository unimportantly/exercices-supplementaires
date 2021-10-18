package banque;

/**
 * create a child class from compte so it'll get interests
 */
public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil {

    //attributes
    public double seuil;
    public double taux = Math.random();

    //Constructors
    public CompteASeuilRemunere(){}

    public CompteASeuilRemunere(int accountNumber, double balance, double seuil) {
        super(accountNumber, balance);
        this.seuil = seuil;
    }

    //g&s
    public double getSeuil() {
        return 0;
    }
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return "CompteASeuilRemunere{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", seuil=" + seuil +
                ", taux=" + taux +
                '}';
    }
}
