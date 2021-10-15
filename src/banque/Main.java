package banque;

public class Main {
    public static void main(String[] args) {

        Compte c1 = new Compte(1535154, 354);
        Compte c2 = new Compte(684, 4996);
        Client client1 = new Client("Clement", 34, 666);
       client1.addAccount(c2);
        client1.addAccount(c1);
//        client1.getAccount(684);
        client1.getAccount(1535154);
    client1.getAccount(684);

    }
}
