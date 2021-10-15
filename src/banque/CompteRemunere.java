package banque;

public class CompteRemunere extends Compte implements ICompteRemunere{

    //attributes
    private double taux = Math.random();

    //constructors
    public CompteRemunere(){
        super();
    }
    public CompteRemunere(int accountNumber, double balance) {
        super(accountNumber, balance);
        this.taux = taux;
    }

    //methods
    /**
     * computes the interests earned on one account
     * allows the interests to be added to the current balance
     * @return
     */
    public double calculerInterets(){
        double interets = this.getBalance() * this.taux;
        return interets;
    }
    public void verserInterets(){
        this.balance += this.calculerInterets();
        System.out.println(balance);
    }

    //g&s
    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", taux=" + taux +
                '}';
    }
}
