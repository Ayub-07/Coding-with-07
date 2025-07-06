/*
Closing Triplets
Given three arrays A, B, and C, choose a triplet a, b, c such that a, b, and c belong to the arrays A, B, and C respectively, such that the absolute difference between the maximum and minimum element of the chosen triplet is minimized, i.e., minimize |max(a,b,c)-min(a,b,c)|.

Input Format
The first line of input contains T - the number of test cases. It is followed by 6T lines, the first line contains N1 - the size of the array A and the second line contains the elements of the array A. The third line contains N2 - the size of the array B and the fourth line contains the elements of the array B. The fifth line contains N3 - the size of the array C and the sixth line contains the array C elements.

Output Format
For each test case, print the minimum absolute difference, separated by a newline.

Constraints
10 points
1 <= T <= 100
1 <= N1, N2, N3 <= 100
0 <= A[i], B[i], C[i] <= 109

30 points
1 <= T <= 100
1 <= N1 ,N2, N3 <= 500
0 <= A[i], B[i], C[i] <= 109

60 points
1 <= T <= 100
1 <= N1, N2, N3 <= 10000
0 <= A[i], B[i], C[i] <= 109

Example
Input
1
5
10 8 5 4 1
3
6 9 15
4
8 3 2 6

Output
1

Explanation

Example 1: The triplet (5,6,6) belongs to the arrays A, B, and C respectively and it gives |max(a,b,c)-min(a,b,c)| = 1. */
import java.util.*;
class ClosingTriplets {
  
    public static int ClosingTriplets(int a[] , int n1 , int b[] , int n2 , int c[] , int n3){
        int mindiff = Integer.MAX_VALUE;        
        int p1 = 0 , p2 = 0 , p3 = 0;           // 3 pointers for traversing through each array
        while (p1<n1 && p2<n2 && p3<n3){
            int min = Math.min(Math.min(a[p1],b[p2]),c[p3]);
            int max = Math.max(Math.max(a[p1],b[p2]),c[p3]);
            int diff= max-min;                             //MAIN LOGIC
            mindiff = Math.min (mindiff , diff);

            if(min==a[p1])                  //increment pointer of the array with the minimum element so that the resultant differnce can be minimized.
                p1++;
            else if (min == b[p2])
                p2++;
            else
                p3++;
        }
        return mindiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n1 = sc.nextInt();
            int [] A = new int[n1];
            for(int i=0;i<n1;i++)
                A[i] = sc.nextInt();
            int n2 = sc.nextInt();
            int [] B = new int[n2];
            for(int i=0;i<n2;i++)
                B[i] = sc.nextInt();
            int n3 = sc.nextInt();
            int [] C = new int[n3];
            for(int i=0;i<n3;i++)
                C[i] = sc.nextInt();
            Arrays.sort(A);
            Arrays.sort(B);
            Arrays.sort(C);
            int result = ClosingTriplets(A,n1,B,n2,C,n3);
            System.out.println(result);
            
        }
    }
}