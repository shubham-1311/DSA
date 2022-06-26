package Recursion;

public class Practice {

    public static int sumArray(int[] nums,int n){
        if(n==0) return 0;
        if(n==1)return nums[n-1];
        int sum=nums[n-1];
        return sum+ sumArray(nums,n-1);

    }
    public static void print(int [] arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            System.out.println("  size ="+ size);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //SumArray returns the sum of the given array
        int[] arr={1,6,4,8,10,11,12,15};
        int l=arr.length;
//        System.out.println(sumArray(arr,9));
        for(int i=0;i<arr.length;i++) {
            l--;
            print(arr,l);
        }
    }
}
