package com.example.csmore;

public class Account {
    private int accountBalance = 1000;
    private String currency = "CZK";

    public boolean checkBalance(String num){
        int num1 = Integer.parseInt(num);
        if(num1<=getAccountBalance()){
            return true;
        }
        return false;
    }

    public  int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
