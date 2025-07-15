/**
 *                          EXCLUSION PRODUCT
 
 * You are given an array of integers of size N. Create a new array such that the element at an index i in the new array is the product of all the elements of the original array except the element present at index i.

Input Format
The first line of input contains T - the number of test cases. For each test case, the first line contains N - the size of the array. The second line contains N integers - the elements of the array.

Output Format
For each test case, print the new array, separated by a new line. Since these numbers can be very large, print the numbers % 109 + 7

Constraints
1 <= T <= 100
2 <= N <= 105
0 <= A[i] <= 105

Example
Input
2
5
1 5 3 2 8
6
4 10 1 2 8 3

Output
240 48 80 120 30
480 192 1920 960 240 640

Explanation

Test-Case 1
The product of all elements of the array except for the element at index 0 is 5 * 3 * 2 * 8 = 240
The product of all elements of the array except for the element at index 1 is 1 * 3 * 2 * 8 = 48
The product of all elements of the array except for the element at index 2 is 1 * 5 * 2 * 8 = 80
The product of all elements of the array except for the element at index 3 is 1 * 5 * 3 * 8 = 120
The product of all elements of the array except for the element at index 4 is 1 * 5 * 3 * 2 = 30
 */
import java.util.*;

public class ExclusionProduct {
    static final int MOD = (int) 1e9+7;

        public static void ExclusionProduct (long ar[] , int n){
          long [] PP = new long [n];
          PP[0] = ar[0];                  // PREFIX PRODUCT array . (Similar to that of Prefix sum) 
          for(int i=1;i<n;i++){
            PP[i] = PP[i-1] * ar[i] % MOD;
          }
          long [] SP = new long [n];      // SUFFIX PRODUCT array . (Similar to that of Suffix Sum) 
          SP[n-1] = ar[n-1];
          for(int i=n-2;i>=0;i--){
            SP[i] = SP[i+1] * ar[i] % MOD;
          }
          ar[0] = SP[1];         // Here we arent taking new array for storing the result but just modifying the given array itself .
          ar[n-1] = PP[n-2];

          for(int i=1;i<n-1;i++){         
            ar[i] = PP[i-1] * SP[i+1] % MOD;    //MAIN LOGIC 
          }

          for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
          }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr [] = new long [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            ExclusionProduct(arr,n);
            System.out.println();
        }
    }
}