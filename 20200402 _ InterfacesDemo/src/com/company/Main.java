package com.company;

public class Main {

    public static void main(String[] args) {
	    CashOut[] cashOuts = {
	            new ATM(),
                new Clerk()
        };
	    Person person= new Person("Andy");
	    for (int i=0; i<cashOuts.length;i++){
	        cashOuts[i].cashOut(person);
        }

    }
}
