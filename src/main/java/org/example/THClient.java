package org.example;

public class THClient {
    Bank bank;

    public THClient(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
    public double getBalance(long accid)
    {
        System.out.println("in torry harris client: get Balance");
        return bank.getBalance(accid);
    }
    public double withdraw(long accid,double amount)
    {
        System.out.println("in th withdraw");
        return bank.withdraw(accid,amount);
    }
    public double deposit(long accid,double amount)
    {
        System.out.println("in th deposit");
        return bank.deposit(accid,amount);
    }

}