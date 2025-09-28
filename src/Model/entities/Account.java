package Model.entities;

import Model.excepitions.EntitiesException;

public class Account {

    private final Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(double withdrawLimit, double balance, String holder, Integer number) {
        this.withdrawLimit = withdrawLimit;
        this.balance = balance;
        this.holder = holder;
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws EntitiesException{
        if (amount > withdrawLimit){
            throw new EntitiesException("The amount exceeds withdraw limit");
        }
        if (amount > balance){
            throw new EntitiesException("Not enough balance");
        }

        balance -= amount;
    }
}
