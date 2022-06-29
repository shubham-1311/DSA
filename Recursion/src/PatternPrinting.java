public class PatternPrinting {
    public static void printPattern(int n){
        printer(n);
    }
    //to print a pattern
    // 1
    // 12
    // 123
    // 1234
    // 12345
    //
    //
    //

    public static int printer(int n){

        if(n==0) return 0;

        int a=printer(n-1) ;
        System.out.println(n);
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        return n;
    }

    public static void main(String[] args) {
        printer(5);

        System.out.println();
        printPattern(8);
    }
}
