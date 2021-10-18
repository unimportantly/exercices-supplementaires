package banque;

/**
 * solidifies the methods of compteremunere in an interface
 */
public interface ICompteRemunere {

    //methods
    public double calculerInterets();
    public void verserInterets();
    public double getTaux();
    public void setTaux(double taux);
}
