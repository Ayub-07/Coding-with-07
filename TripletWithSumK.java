/**
 * Triplet with Sum K 
 
 You are given an integer array and a positive integer K. You have to tell if there exists i,j,k in the given array such that ar[i]+ar[j]+ar[k]=K, i≠j≠k.

Input Format
The first line of input contains T - the number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array.

Output Format
For each test case, print "true" if the arrays contains such elements, "false" otherwise, separated by new line.

Constraints
30 points
1 <= T <= 100
3 <= N <= 100

70 points
1 <= T <= 100
3 <= N <= 1000

General Constraints
-105 <= A[i] <= 105
0 <= K <= 105

Example
Input
3
5 60
1 20 40 100 80
12 54
12 45 52 65 21 645 234 -100 14 575 -80 112
3 15
5 5 5

Output
false
true
true

 */
import java.util.*;

public class TripletWithSumK {
    public static boolean isTripletSum(int a[] , int n , int k){
        int p0 = 0;              //pointer 0 (pointing the first element)
        while(p0 < n-2){
            int p1 = p0+1 , p2 = n-1; // pointer 1 (pointing the corresponding element of p0), pointer 2 (pointing last element)
            while(p1<p2){
                int sum = a[p0]+a[p1]+a[p2]; 
                if(sum == k)                //MAIN LOGIC
                    return true;
                else if (sum < k)
                    p1++;
                else
                    p2--;
            }
            p0++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr [] = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);           // SORTS THE ARRAY
            if(isTripletSum(arr,n,k)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}