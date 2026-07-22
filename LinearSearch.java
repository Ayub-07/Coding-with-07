/*
Implement Linear Search 

Given an array of integers, search a given key in the array using linear search.

Note: 
 Do not use any inbuilt functions / libraries for your main logic.  Input Format
The first line of input contains two integers N and K. N is the size of the array and K is the key. The second line contains the elements of the array.

Output Format
If the key is found, print the index of the array, otherwise print -1.

Constraints
1 <= N <= 102
0 <= arr[i] <= 109

Example
Input
5 15
-2 -19 8 15 4

Output
3

Explanation

Self Explanatory 

***********************************  SHORTEST CODE FOR LINEAR SEARCH ****************************** */

import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int arr [] = new int [n];
        int ans = -1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == k){
                ans = i;
                break;
            }
        }
        System.out.print(ans);
    }
}