package com.rupali.Day52;

public class BankAccountt {
    private int balance;
    public void deposit(int amount){
        balance+=amount;
        System.out.println(amount);
    }
    public void withdraw(int amount){
        balance-=amount;
        System.out.println(amount);
    }
    public void account(){
        System.out.println(balance);
    }
    public static void main(String[] args) {
        BankAccountt acc = new BankAccountt();
        acc.deposit(2000);
        acc.withdraw(500);
        acc.account();
    }
}