package com.example.amado.Accounts;

import com.example.amado.Accounts.BankAccount;

/**
 * Created by Amado on 10/01/2015.
 */
public class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if(numberOfWithdrawls()>=3){
            return;
        }
       super.withdraw(amount);
    }
}
