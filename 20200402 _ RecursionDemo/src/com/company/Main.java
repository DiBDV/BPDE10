package com.company;

public class Main {

    public static void main(String[] args) {
	  f(1);
	  // !5 = 1*2*3*4*5 = !4*5
       //!4=!3*4
       //!3=!2*3
    }

    // the method illustrates recursion
    public static void f(int i){
        int n=i;
        String spaces="";
        for(int j=0;j<i;j++,spaces+=" ");
        
        System.out.println(spaces+"start f("+i+")");
        i++;
         if (i<6) {
             f(i);
         }
        System.out.println(spaces+"end f("+n+")");
         return;
    }

    public static int factorial (int n){
        if(n == 1)
            return 1;
        else
            return (n*factorial(n-1));
    }

    /* stack
    3
    2
    1
    [][][][3][2][1]
    1
    2
    3

    f1(parF1){  f2(parF2){ f4() }  h1()    }  f3(parF3)

    [f(6)][f(5)][f(4)][f(3)][f(2)][f(1)]


(f(1)
    (f(2)

)


     */


}
