package Recursion;

import java.sql.SQLOutput;

public class Power {
    public static int powerOf2(int n){
        //base case
        if(n==0)return 1;

        //processing
        return 2*powerOf2(n-1);
    }
    public static int reverseCount(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return reverseCount(n-1);
    }

}
