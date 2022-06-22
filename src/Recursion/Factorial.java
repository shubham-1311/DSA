package Recursion;

public class Factorial {
    //Recursive method to return factrial of a number
    static long factorial(int n){
        if(n==0)return 1;

        return n* factorial(n-1)%100000007;
    }
    public static void main(String[] args){
        System.out.print(factorial(3));
    }
}
