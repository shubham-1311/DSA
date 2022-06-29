//https://codeforces.com/problemset/problem/1520/D
//c2ladder 1200-1
// Brute force solution works but gives TLE need to work this using MAps or some other better technique

import java.io.IOException;
import java.util.Scanner;

public class SameDifference {
    //takes n[] of size x and returns the pair aj-ai=j-i
    public static int pairs(int[] n){
        int count=0;
        for (int i = 0; i < n.length-1; i++) {
            for (int j = i+1; j <n.length; j++) {
                if(n[i]<n[j] && (n[j]-n[i])==(j-i)){
                    count++;
                }

            }

        }
        return count;
    }
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int size= sc.nextInt();
            int[] arr=new int[size];
            for (int i1 = 0; i1 < size; i1++) {
                arr[i1]= sc.nextInt();
            }
            System.out.println();

            System.out.println(pairs(arr));
        }
    }
}
