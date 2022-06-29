import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse1(int[] arr){
        int k= arr.length-1;
        int[] rev=new int[arr.length];
        for (int i : arr) {
            rev[k]=i;
            k--;
        }
        return rev;

    }
    public static int[] reverse2(int[] arr,int start, int end){
        if(start>=end)return arr;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        return reverse2(arr,++start,--end);
        }
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String line =bufferedReader.readLine();
        String[] n=line.trim().split(" ");
        int[] arr=new int[n.length];
        for (int i = 0; i < n.length; i++) {
            arr[i]=Integer.parseInt(n[i]);
        }
        //approach 1 to reverse array complexity is O(n)
        int[] approach1= reverse1(arr);
        System.out.println("1--> "+Arrays.toString(approach1));

        //approach 2 to reverse array, using recursion complexity is O(log n)
        int[] approach2= reverse2(arr,0,arr.length-1);
        System.out.println("2--> "+Arrays.toString(approach2));
    }
}
