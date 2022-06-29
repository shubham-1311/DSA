import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimuMaximum {

    public static class Pair{
        static int min;
        static int max;
    }
    public static int[] minMax(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i : arr) {
            if(i<min)min=i;
            if(i>max)max=i;
        }
        return new int[]{min,max};
    }

    //Recursive Method: Tournament Method
    public static Pair minMax(int []arr,int low,int high){
        Pair m=new Pair();
        Pair ml=new Pair();
        Pair mr=new Pair();
        int mid;
            if(low==high){
                m.min=arr[low];
                m.max=arr[low];
                return m;

            }
            if(low == high+1){
                m.max=arr[low];
                m.min=arr[high-1];
                    if(m.max<m.min){
                        m.max=m.max^m.min;
                        m.min=m.max^m.min;
                        m.max=m.max^m.min;
                    }
                return m;
            }

            else{
                mid=(low+high)/2;
                ml=minMax(arr,0,mid);
                mr=minMax(arr,mid+1,high);
            }
            //check for min
            if(ml.min<mr.min) m.min=ml.min;
            else m.min=mr.min;

            //check for max
            if(ml.max>mr.max)m.max=ml.max;
            else m.max=mr.max;

        System.out.println(
                "Min -->"+m.min+
                        "\nMax -->"+m.max+"\n"+low+"\t"+high
        );

            return m;
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
        //method 1
        int[] minmax=minMax(nums);
        System.out.println(
                "Min -->"+minmax[0]+
                "\nMax -->"+minmax[1]
        );

        //method 2
        Pair m=minMax(nums,0,nums.length);
        System.out.println(
                "Min -->"+m.min+
                        "\nMax -->"+m.max
        );
    }

}
