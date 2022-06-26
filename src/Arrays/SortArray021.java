package Arrays;
/*
  Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


  Example 1:

  Input:
  N = 5
  arr[]= {0 2 1 2 0}
  Output:
  0 0 1 2 2
  Explanation:
  0s 1s and 2s are segregated
  into ascending order.
  Example 2:

  Input:
  N = 3
  arr[] = {0 1 0}
  Output:
  0 0 1
  Explanation:
  0s 1s and 2s are segregated
  into ascending order.

  Your Task:
  You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


  Expected Time Complexity: O(N)
  Expected Auxiliary Space: O(1)


  Constraints:
  1 <= N <= 10^6
  0 <= A[i] <= 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortArray021 {

    public static void sort012(int[] a, int n)
        {

            int c0=0,c2=n-1,i=0,temp;
            //the plan is to traverse array if 1 is found move ahead if 0 found swap it to beginning
            //if 2 found move it to the end...eventually we will get a sorted array

            while(i<=c2){
                if(a[i]==1){
                    i++;
                }
                else if(a[i]==0){
                    temp=a[i]; // swapping , sending 0 at the beginning;
                    a[i]=a[c0];
                    a[c0]=temp;
                    c0++;
                    i++;
                }
                else {
                    temp=a[i]; // swapping and sending 2 to the end
                    a[i]=a[c2];
                    a[c2]=temp;
                    c2--;
                }


            }

        }


    // { Driver Code Starts.
    public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                int n = Integer.parseInt(br.readLine().trim());
                int[] arr = new int[n];
                String[] inputLine = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++) arr[i] = Integer.parseInt(inputLine[i]);
//                Solution ob=new Solution();
                sort012(arr, n);
                StringBuffer str = new StringBuffer();
                for(int i=0; i<n; i++){
                    str.append(arr[i]).append(" ");
                }
                System.out.println(str);
            }
        }
    }

    // } Driver Code Ends

