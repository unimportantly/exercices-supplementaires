package banque;

public class CompteRemunere extends Compte {

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