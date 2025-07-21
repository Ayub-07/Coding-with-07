/**
  Bubble Sort 
  
Implement Bubble Sort and print the total number of swaps involved to sort the array.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line of each test case contains N - the size of the array. The next line contains N integers - the elements of the array.

Output Format
For each test case, print the total number of swaps, separated by a new line.

Constraints
1 <= T <= 100
1 <= N <= 100
-1000 <= ar[i] <= 1000

Example
Input
4
8
176 -272 -272 -45 269 -327 -945 176
2
-274 161
7
274 204 -161 481 -606 -767 -351
2
154 -109

Output
15
0
16
1

 */
import java.util.*;

public class BubbleSort {
    public static void swap ( int a[] ,int x , int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count = 0;    // TO COUNT NUMBER OF SWAPS
            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){          //MAIN LOGIC
                        swap ( arr , j , j+1);
                        count++;
                    }
                }
            }
            System.out.println(count);      //PRINTING NUMBER OF SWAPS .
            System.out.println();

            //IN THE QUESTION IT WAS ASKED TO PRINT THE NUMBER OF SWAPS . YOU CAN ALSO PRINT THE RESULTANT SORTED ARRAY BY FOLLOWING CODE

            for(int i=0;i<n;i++){
              System.out.print(arr[i]);
            }
           System.err.println();
        }
    }
}