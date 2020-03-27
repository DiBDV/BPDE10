package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
inheritance demo project
 */
public class Main {

    public static void main(String[] args) {
        //Employee em1 = new Employee("Nick", 1000); // Employee is abstract class.
                                                    // it means that we don't be able to create an object of Employee
        Employee em1 = new Programmer("Nick", 1000,5); //

        System.out.println(em1);
        em1.doWork();
        em1.pay();

        System.out.println("------------  MANAGER ------------------");
        Manager manager = new Manager("Jack", 2000);
        System.out.println(manager);
        System.out.println("getter " +manager.getName());
        manager.doWork();
        manager.pay();

        System.out.println("------------  PROGRAMMER ------------------");
        Programmer progr1 = new Programmer("Oleg", 2000,10);
        System.out.println(progr1);
        System.out.println(progr1.getName());
        progr1.pay();
        progr1.doWork();

        System.out.println(" -------------------- array of employees");
        Employee[] employees = {manager,progr1};
        for (int i=0;i<employees.length;i++){
            employees[i].pay();
            employees[i].doWork();
        }

        //--------------------------
        System.out.println("------ Programmer is an Employee");
         Employee progr2 = new Programmer("Andy", 1000, 1);
        progr2.doWork();


        Programmer prog3= (Programmer) progr2;







        //Object --> Employee --> Manager,Programmer
    }
}
