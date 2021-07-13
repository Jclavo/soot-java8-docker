// package src.java.fizzbuzz;

public class FizzBuzz{

    public static void main(String[] args){
       
        for (int i=1; i<=100; i++)
            printFizzBuzz(i);
    }

    public static void test(){

    }
    public static void printFizzBuzz(int k){
        if (k%15==0)
            System.out.println("FizzBuzz");
        else if (k%5==0)
            System.out.println("Buzz");
        else if (k%3==0)
            System.out.println("Fizz");
        else
            System.out.println(k);
    }

}