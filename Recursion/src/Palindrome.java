import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {


    public static int helper(String str,int start,int end){
        if(start>=end) return 1;
        if(str.charAt(start)!=str.charAt(end)) return 0;
        return helper(str,start+1,end-1);
    }
    public static int isPalin(String str){
        int n= str.length();
        if(n==0) return 0;
        int flag=helper(str,0,n-1);
        return flag;

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String word=br.readLine().trim();
        if(isPalin(word)==0) System.out.println("Not a Palindrome");
        else System.out.println(word+" : is a Palindrome.");

    }
}
