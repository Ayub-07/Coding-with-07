/*
  Finding Frequency 
  
  Given an array, you have to find the frequency of a number X.

Input Format
The first line of input contains N - size of the array. The next line contains N integers, the elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains a single integer X, for which you have to find the frequency of X in the given array.

Output Format
For each query, print the frequency of X, separated by a new line.

Constraints
20 points
1 <= N <= 105
1 <= Q <= 102
-108 <= ar[i] <= 108

30 points
1 <= N <= 105
1 <= Q <= 105
-108 <= ar[i] <= 108

50 points
1 <= N <= 105
1 <= Q <= 105
-108 <= ar[i] <= 108

Example
Input
9
-6 10 -1 20 -1 15 5 -1 15
5
-1
10
8
15
20

Output
3
1
0
2
1
*/
import java.util.*;

class FindingFrequency{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> hmap = new HashMap<>();                // HashMap to store the frequncies (num,frequency)
        for (int num : arr){
            hmap.put (num, hmap.getOrDefault(num,0)+1);             // MAIN LOGIC
        }
        int q = sc.nextInt();
        while(q-->0){
            int x = sc.nextInt();
            System.out.println (hmap.getOrDefault(x,0));
        }
    }
}