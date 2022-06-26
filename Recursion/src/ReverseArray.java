import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArray {
    //method to reverse array using Recursion
    public static int[] helper(int[] arr, int start,int end){
        if(start>=end) return arr;
        arr[start]=arr[start]^arr[end];
        arr[end]=arr[start]^arr[end];
        arr[start]=arr[start]^arr[end];
        return helper(arr,start+1,end-1);
    }
    public static int[] reverseArray(int[] arr){
        int n=arr.length;
        helper(arr,0,n-1);
        return arr;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        //To Input Integer Array using buffered Reader
        //first a line is read in string then that string is split into array of string containing
        //numbers which is then parsed into Integers
        String line=bufferedReader.readLine();
        String[] str=line.trim().split(" ");
        int n=str.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int[] reverse=reverseArray(arr);
        System.out.println(Arrays.toString(reverse));
        //reverse[i] doesn't work in for each loop
        // as it goes through all the elements and 'i' here contains elements not index
        for (int i : reverse) {
            System.out.print(i+" ");

        }
    }
}
