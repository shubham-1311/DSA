public class Backtracking {
    public static void main(String[] args ) {
         String str="ABC";
         printPermutation(str,"",2);

    }
    //This function will print all the permutations of the given String
    public static void printPermutation(String str, String perm, int idx){
       //Base Case
        if(str.length()==0){
            System.out.println(perm);
        }
        /*
        *  choose each character of the string, then remove it from the string and
        *  call recursive function on the remaining string
        *  'ABC' was there so remove A and call recursive function on 'BC'
        *  then remove B and call for C.
        *
        * Backtracking part is
        * */
        for(int i =0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
//            System.out.println(newStr+"---"+currentChar+"---"+perm+"--"+i+"--"+idx);
            printPermutation(newStr,perm+currentChar,idx+1);
        }

    }
}
