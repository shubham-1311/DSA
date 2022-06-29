import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimuMaximum {

    public static int[] minMax(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i : arr) {
            if(i<min)min=i;
            if(i>max)max=i;
        }
        return new int[]{min,max};
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().trim().split(" ");
        int[]nums =new int[str.length];
        int i=0;
        for (String s : str) {
            nums[i]=Integer.parseInt(s);
            i++;
        }
        int[] minmax=minMax(nums);
        System.out.println(
                "Min -->"+minmax[0]+
                "\nMax -->"+minmax[1]
        );
    }

}
