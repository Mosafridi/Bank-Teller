/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author Dell
 */
public abstract class BankAccount {
    protected String acNum;
    protected String acName;
    protected int pin;
    protected double balance;

    public BankAccount(String acNum, String acName) {
        this.acNum = acNum;
        this.acName = acName;
    }

    public BankAccount() {
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAcNum() {
        return acNum;
    }

    public String getAcName() {
        return acName;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }
    
    
    public abstract double calcIntrest();
        
    }
    
    

