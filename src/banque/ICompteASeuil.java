package banque;

public interface ICompteASeuil {

    //methods
    public void retirer(double amount) throws BanqueException;
    public double getSeuil();
    public void setSeuil(double seuil);
}
