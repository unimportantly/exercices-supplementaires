package banque;

public class Main {
    public static void main(String[] args){

        Compte c1 = new Compte(1535154, 354);
        Compte c2 = new Compte(684, 4996);
        Client client1 = new Client("Clement", 34, 666);
        CompteRemunere c3 = new CompteRemunere(125, 2500);
        CompteASeuil c4 = new CompteASeuil(1677,600,100);
        CompteASeuilRemunere c5 = new CompteASeuilRemunere(133, 4500,600);
        try {
             client1.addAccount(c2.getAccountNumber(), c2);
             client1.addAccount(c1.getAccountNumber(),c1);
             client1.addAccount(c3.getAccountNumber(),c3);
             client1.addAccount(c4.getAccountNumber(),c4);
             client1.addAccount(c5.getAccountNumber(), c5);
        } catch (BanqueException e) {
           e.getMessage();
        }
        client1.getAccount(1535154);
            client1.getAccount(684);
      client1.verserInterets();
        }
    }

