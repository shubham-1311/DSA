import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Implementation of Quick sort
public class QuickSortImplementation {

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr, int start,int end){
        int pivot= arr[end];
        int counter=start-1;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                counter++;
                swap(arr,i,counter);
            }
        }
        swap(arr,counter+1,end);
        return counter+1;
    }
    private static void QuickSort(int[] arr,int start,int end){
        if(start<end){
            int pivot=partition(arr,start,end);

            QuickSort(arr,start,pivot-1);
            QuickSort(arr,pivot+1,end);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] array=br.readLine().trim().split(" ");
        int[] arr=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i]=Integer.parseInt(array[i]);
        }

        QuickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }


}
