package com.company;

public  class Programmer extends Employee{
Employee emp;

    public Programmer(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public Programmer(String name, int salary) {
        super(name, salary);
    }


    @Override
    public String toString() {
        return "Programmer{" + super.toString() +
                '}';
    }

    //public abstract void doWork();
    public  void pay(){
        System.out.println("I've got "+ ((this.getExperience()<5)?this.getSalary():this.getSalary()+2000));
    }

    @Override
    public void doWork() {
        System.out.println("I'am junior programmer/ I write project/");
    }

    public void codeGenerate(){
        System.out.println("generate code");
    }

}
