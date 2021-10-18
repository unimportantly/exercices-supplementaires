package banque;

import java.sql.SQLOutput;
import java.util.*;

/**
 * create a client class for a bank
 * add parameters & methods
 */

public class Client {

    //attributes
    private String name;
    private int age;
    private int idNumber;
    private Map<Integer, Compte> accounts = new Hashtable<Integer, Compte>();

    //constructors
    public Client() {
    }
    public Client(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    //methods

    /**
     * add a new accounts if it hasn't already
     * checks if there is space available
     * @param accountNumber
     * @param compte
     * @throws BanqueException
     */
    public void addAccount(int accountNumber, Compte compte) throws BanqueException{
            if (this.accounts.size() < 5){
                this.accounts.putIfAbsent(accountNumber, compte);
                System.out.println("you have successfully added a new account");
            } else if (this.accounts.size() >= 5){
               throw new BanqueException("You have reached the maximum number of accounts you are allowed to possess.");
            }
        }

    /**
     * checks if user owns a specified account
     * @param accountNumber
     * @return
     */

    public Compte getAccount(int accountNumber) {
            if (!this.accounts.containsKey(accountNumber)) {
                System.out.println("There is no account at this spot");
            }
             else if (this.accounts.containsKey(accountNumber)) {
                    System.out.println("You have " + this.accounts.get(accountNumber).getBalance() + "$ on the account number " + accountNumber);
                }
        return accounts.get(accountNumber);
    }

    /**
     * runs through accounts & decides when to give interests
     */

    public void verserInterets() {
        this.accounts.forEach((key, value) ->{
            if (this.accounts.get(key) instanceof CompteRemunere) {
                System.out.println("les interets du compte " + this.accounts.get(key).getAccountNumber() + " s'elevaient a " + ((CompteRemunere) this.accounts.get(key)).calculerInterets());
            }
        });
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
    public Compte getAccounts() {
        return this.accounts.get(accounts.entrySet());
    }
    public void setAccounts(Integer accountNumber, Compte compte) {
        this.accounts.put(accountNumber, compte);
        }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idNumber=" + idNumber +
                ", accounts=" + accounts +
                '}';
    }
}

