/*
Rearrange Sequence - 2 

You are given an array of size N containing integers which may not be unique. Find the size of the largest subarray that can be rearranged to form a strictly contiguous sequence.

Input Format
The first line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

Output Format
For each test case, print the size of the largest subarray that can be rearranged to form a contiguous sequence, on a new line.

Constraints
30 points
1 <= T <= 100
4 <= N <= 100

70 points
1 <= T <= 100
4 <= N <= 1000

General Constraints
0 <= A[i] <= 105

Example
Input
2
5
4 3 3 1 1
9
8 8 6 7 3 5 7 1 1

Output
2
3

Explanation

Test-Case 1
The largest subarray which can be rearranged to form a contiguous sequence here, is {4, 3} which can be rearranged to form {3, 4}.

Test-Case 2
The largest subarray which can be rearranged to form a contiguous sequence here, is {8, 6, 7} which can be rearranged to form {6, 7, 8}. */
import java.util.*;

 class RearrangeSeq2 {

    public static int seq2(int a[] , int n){
        int ans = 0;
        for(int i=0;i<n;i++){
        Set <Integer> hset = new HashSet<>(); //Using Hashset to iterate only non-identical values
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j=i;j<n;j++){
                if(hset.contains(a[j])){    
                    break;                      // This breaks the j loop when identical values are encountered
                }
                hset.add(a[j]);
                max = Math.max(max,a[j]);
                min = Math.min(min,a[j]);
                if(max-min == j-i){              // MAIN LOGIC
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
           int n = sc.nextInt();
           int [] ar = new int[n];
           for(int i=0;i<n;i++)
                ar[i] = sc.nextInt();
            System.out.println(seq2(ar,n));
       }
    }
}