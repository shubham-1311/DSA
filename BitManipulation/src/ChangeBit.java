/** Given a number N, complete the following tasks,
        Task 1. Generate a new number from N by changing the zeroes in the binary representation of N to 1.
        Task  2. Find the difference between N and the newly generated number.



        Example 1:

        Input: N = 8
        Output: 7 15
        Explanation:
        There are 3 zeroes in binary representation
        of 8. Changing them to 1 will give 15.
        Difference between these two is 7.

        Example 2:

        Input: N = 6
        Output: 1 7
        Explanation:
        There is 1 zero in binary representation
        of 6. Changing it to 1 will give 7.
        Difference between these two is 1.


        Your Task:
        You don't need to read input or print anything.
        Your task is to complete the function changeBits() which takes an integer N as input parameter
         and
        returns a list of two integers containing the difference and the generated number respectively.

        Expected Time Complexity: O(log(N))
        Expected Auxiliary Space: O(1)

        Constraints:
        0 <= N <= 108
**/

    // { Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    class ChangeBit {
        public static void main(String[] args) throws IOException {
            BufferedReader read =
                    new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                int N = Integer.parseInt(read.readLine());

                Solution1 ob = new Solution1();
                int[] ans = ob.changeBits(N);
                System.out.println(ans[0]+ " "+ ans[1]);
            }
        }
    }// } Driver Code Ends


//User function Template for Java

    class Solution1 {
        static int[] changeBits(int N) {
            int cmp = newNum(N);
            int[] arr = {cmp - N, cmp};
            return arr;
        }

        public static int newNum(int N) {
            int i = 0, k = 0;
            int n = N;
            while (n != 0) {
                // if( (int)(n&1) ==1)i++;
                n = n / 2;

                k = k + (int) Math.pow(2, i);
                i++;
                //System.out.println(i+".."+k);
            }
            return k;
        }
    }

    class Solution2 {

        static int[] changeBits(int N) {
            int[] arr = new int[2];
            int bits = 1 + (int) (Math.log(N) / Math.log(2));    // Getting Number of bits of the number.
            int ans = (int) Math.pow(2, bits) - 1; // Getting the Changed Number
            int sub = ans - N;
            arr[0] = sub; // Assigning their values to the Array.
            arr[1] = ans;
            return arr;
        }
    }


