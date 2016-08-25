package com.mybank.mvc;

public class Model {
    protected double balance;
    
    public double getBalance() {
        return balance;
    }
    
    public void doDeposit(double amt)  {
        balance = balance + amt;
    }
}
