import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class NonRepeatingElements {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String nums=br.readLine();
        String[] list=nums.split(" ");
        int[] arr=new int[list.length];
        for(int i=0;i<list.length;i++ )arr[i]=Integer.parseInt(list[i]);
        int a=singleNonRepeat(arr);
        System.out.println(Arrays.toString(arr)+ "Non Repeating Element is --> "+a);
    }

    //This method returns non repeating element when others are repeating twice
    private static int singleNonRepeat(int[] arr) {
        int res=0;
        for (int i : arr) {
            res=res^i;

        }
        return res;

    }
    private static String doubleNonRepeat(int[] arr){

        int n=0;
        //n will contain the xor of two elements which are non repeating twice
        for (int i : arr) {
            n=n^i;
        }
        //now let's devide the array in two groups
        ArrayList<Integer> a=new ArrayList();
        ArrayList<Integer> b=new ArrayList();
        ArrayList<Integer> res=new ArrayList();

        for (int i : arr) {
            if((i&0)==1)a.add(i);
            else b.add(i);
        }
        a.forEach(res=a^res.get());

        }

    }
}
