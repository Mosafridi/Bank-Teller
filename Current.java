/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author Dell
 */
public class Current  extends BankAccount {
    
    private double transactionFees;
    private double intrestRate;

   

    public Current(String acNum, String acName) {
        super(acNum, acName);
    }
    
   // withdrew method includes transcation fees and retrurn balance
    public double withdrew (double amount){
        balance = balance- amount - transactionFees ;
        
        return  balance;
    }

    @Override
    public double calcIntrest() {
          
     balance = (balance *intrestRate);
     return balance; 
  }
    }
   

   
