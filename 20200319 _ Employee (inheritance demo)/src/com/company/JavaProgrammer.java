package com.company;
// Employee -> Programmer -> JavaProgrammer

public class JavaProgrammer extends Programmer {
    public JavaProgrammer(String name, int salary, int experience) {
        super(name, salary, experience);
    }
    public  void doWork(){
        System.out.println("I'am Java programmer/ I write super project");
    }

}
