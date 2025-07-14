/*
Sum of Pairs 

Given an array of integers and a number K, check if there exist a pair of indices i,j s.t. a[i] + a[j] = K and i!=j.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines, first line of each test case contains N - the size of the array and K, and the next line contains N space separated integers - the elements of the array.

Output Format
For each test case, print "True" if such a pair exists, "False" otherwise, separated by newline.

Constraints
30 points
1 <= T <= 100
2 <= N <= 1000

70 points
1 <= T <= 300
2 <= N <= 10000

General Constraints
-108 <= K <= 108
-108 <= ar[i] <= 108

Example
Input
3
5 -15
-30 15 20 10 -10
2 20
10 10
4 7
-4 0 10 -7

Output
True
True
False */

/************************************************TWO POINTER APPROACH  ****************************************************/

import java.util.*;

public class SumOfPairs {

    public static boolean isAPair(int a[] , int n , int k){
        int p1 = 0 , p2 = n-1;                                  //TWO POINTERS
        while(p1 != p2){
            if( (a[p1]+a[p2]) == k){                            // Main logic
                return true;
            }
            else if( (a[p1]+a[p2]) > k)
                p2--;
            else
                p1++;
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
            Arrays.sort(arr);                 //Sorts the array.
            if(isAPair(arr,n,k)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}