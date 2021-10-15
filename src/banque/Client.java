package banque;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Client {

    //attributes
    private String name;
    private int age;
    private int idNumber;
    private Compte[] accounts = new Compte[5];

    //constructors
    public Client() {
    }

    public Client(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    //methods
    public void addAccount(Compte compte) {
        for (int i = 0; i < accounts.length; i++) {
            if (this.accounts[i] == null) {
                this.accounts[i] = compte;
                System.out.println("you have successfully added an account at " + i);
                break;
            } else if (this.accounts[i] != null && i == accounts.length - 1) {
                System.out.println("You have reached the maximum number of accounts you are allowed to possess.");
            }
        }
    }

    public Compte[] getAccount(int accountNumber) {
        for (int j = 0; j < accounts.length; j++) {
            if (this.accounts[j] == null) {
                System.out.println("There is no account at this spot");
            }
             else if (this.accounts[j].getAccountNumber() == accountNumber) {
                    System.out.println("You have " + this.accounts[j].getBalance() + "$ on the account number " + accountNumber);
                }

        }return this.accounts;
    }
    //g&s
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public Compte[] getAccounts() {
        return accounts;
    }
    public void setAccounts(Compte[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idNumber=" + idNumber +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}

