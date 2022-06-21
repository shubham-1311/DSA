import java.io.IOException;
import java.sql.SQLOutput;

public class Backtracking {
    public static void main(String[] args )throws IOException{
         String str="ABC";
         printPermutation(str,"",2);

    }
    //This function will print all the permutations of the given String
    public static void printPermutation(String str, String perm, int idx){
        if(str.length()==0){
            System.out.println(perm);
        }
        for(int i =0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,perm+currentChar,idx+1);
        }

    }
}
