package com.company;

public class ATM implements CashOut, CashIn{
    // ATM implements both interfaces CashOut and CashIn

    @Override
    public void cashOut(Person person) {
        System.out.println("ATM is giving money for " + person);
    }

    @Override
    public void cashIn(Person person) {
        System.out.println("Hi " + person + " Put your money!");
    }
}
