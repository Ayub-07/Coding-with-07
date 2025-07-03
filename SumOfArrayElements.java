/*Sum of Array Elements 
Given an array of integers, find the sum of the elements of the given array.
Note: Try to solve this without declaring / storing the array elements.  

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N - the size of the array, and the second line contains the elements of the array.

Output Format
For each test case, print the sum of the elements of the array, separated by a new line.

Constraints
10 points
1 <= N <= 1000
1 <= arr[i] <= 10^6

40 points
1 <= N <= 1000
1 <= arr[i] <= 10^15

General Constraints
1 <= T <= 100

Example
Input
2
3
5 15 3
2
70 100

Output
23
170
 */
import java.util.*;

 class SumOfArrayElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long sum = 0;
            for(int i=0;i<n;i++){
                long x = sc.nextLong();   // Take long because contraints are too large (10^15) 
                sum+=x;                    //MAIN LOGIC
            }
        System.out.println(sum);
        }
    }
}
// IN THE ABOVE PROGRAM WE ARE NOT DECLARING ARRAY AND DIRECTLY ADDING THE INPUT TO THE "SUM"