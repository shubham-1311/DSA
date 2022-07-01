import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthSmallestElement {

    public static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);

        return i+1;
    }
    public static int quicSelect(int [] arr,int start,int end, int k) {
        //if k is not more than the elements in the array
        if (k>0 && k<=end-start+1) {
            //get the position of pivot from partition method
            int pos = partition(arr, start, end);

            if(k == pos) {
                return pos;
            }

            if(pos>k) return quicSelect(arr, start, pos-1, k);
            else return quicSelect(arr,pos+1,end,k);
        }
        return Integer.MAX_VALUE;
    }
    public static int ksmallQuickSelect(int [] arr,int k){
        int temp=quicSelect(arr,0,arr.length-1,k);

        return arr[temp];
        }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        int countTestCases=Integer.parseInt(br.readLine());
        //Input contains
        // 1.No of Test Cases
        // 2. kth smallest element to find
        // 3. Array of Integers
        while(countTestCases!=0){
            int k=Integer.parseInt(br.readLine());
            String[] str=br.readLine().trim().split(" ");
            int[] n=new int[str.length];
            for (int i = 0; i < str.length; i++) {
                n[i]=Integer.parseInt(str[i]);
            }
            //System.out.println(kthsmall1(n,k));
            System.out.println(Arrays.toString(n)+ksmallQuickSelect(n,k));
          countTestCases--;
        }
    }

    //using Arrays.sort complexity is O(nlogn)
    public static int kthsmall1(int[] arr, int k ){
        Arrays.sort(arr);
//        int count=1;
//        for (int i = arr.length-1; i >= 0; i--) {
//            if(count==k){
//                return arr[i];
//            }
//            count++;
//        }
        System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }

    // This function returns k'th smallest element
    // in arr[l..r] using QuickSort based method.
    // ASSUMPTION: ALL ELEMENTS IN ARR[] ARE DISTINCT
    public static int kthSmallest(int[] arr, int left,int right, int k)
    {
        // If k is smaller than number of elements
        // in array
        if (k > 0 && k <= right - left + 1) {
            // Partition the array around last element and get position of pivot
            // element in sorted array
            int pos = partition(arr, left, right);

            // If position is same as k
            if (pos - left == k - 1)
                return arr[pos];

            // If position is more, recur for left subarray
            if (pos - left > k - 1)
                return kthSmallest(arr, left, pos - 1, k);

            // Else recur for right subarray
            return kthSmallest(arr, pos + 1, right, k - pos + left - 1);
        }

        // If k is more than number of elements in array
        return Integer.MAX_VALUE;
    }

}
