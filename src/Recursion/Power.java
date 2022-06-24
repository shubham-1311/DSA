package Recursion;

import java.sql.SQLOutput;

public class Power {

    public static int fibonacci(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        int ans= fibonacci(n-1)+fibonacci(n-2);
        //System.out.print(ans+"-");
        return ans;

    }

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

    public static int reachHome(int src , int dest){
        if(src==dest){
            System.out.println("Reached Home");
            return 1;
        }
        System.out.println("Source:"+ src+"\t"+"Destination:"+dest);
        reachHome(src+1,dest);
        return 0;
    }


}
