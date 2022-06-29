import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearlyGoodNumbers {
    //method takes two numbers and gives three numbers such that X+y=z &
    // where z is a good number and x y are nearly good
    //EDitorial solution is to represent the number in this format A+A.B=A(B+1)

    public static long[] xyz(long a, long b) {
        long[] res = new long[3];

        if (b==1 || b==0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            res[0]=a;
            res[1]=a*b;
            res[2]=a*(b+1);
            System.out.println(res[0]+" "+res[1]+" "+res[2]);
        }
        return res;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            String inp = br.readLine();
            String[] nums = inp.trim().split(" ");
            int[] n = new int[nums.length];
            for (int j = 0; j < nums.length; j++) {
                n[j] = Integer.parseInt(nums[j]);
            }
            System.out.println();
            long[] xy=xyz(n[0],n[1]);
        }
    }
}


