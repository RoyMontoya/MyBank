package com.example.amado.Accounts;

import java.util.ArrayList;

/**
 * Created by Amado on 09/01/2015.
 */
public abstract class BankAccount {
    private static final double OVERDRAFT_FEE = 30;
    private ArrayList<Double> mTransaction;

    BankAccount(){
        mTransaction= new ArrayList<Double>();
    }

    public void withdraw(double amount){
       mTransaction.add(-amount);
        if(getBalance()<0){
            mTransaction.add(-OVERDRAFT_FEE);
        }
    }
    
    public int numberOfWithdrawls(){
        int count= 0;
        for (int i = 0; i <mTransaction.size() ; i++) {
            if(mTransaction.get(i)<0){
                count++;
            }
        }
        return count;
    }
    
    public void deposit(double amount){

        mTransaction.add(amount);
    }
    public double getBalance(){
        double total = 0;
        for(int i=0; i<mTransaction.size(); i++){
            total += mTransaction.get(i);
        }
        return total;
    }
}
