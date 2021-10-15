package banque;

public interface ICompteASeuil {

    //methods
    public void retirer(double amount);
    public double getSeuil();
    public void setSeuil(double seuil);
}
