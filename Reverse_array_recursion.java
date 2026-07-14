/*  REVERSE ARRAY USING RECURSION

Print the array in reverse order.

Note: 
 Try solving this using recursion. Do not use any inbuilt functions / libraries for your main logic.  Input Format
The first line of input contains N - the size of the array and the second line contains the elements of the array.

Output Format
Print the given array in reverse order.

Constraints
1 <= N <= 100
0 <= ar[i] <= 1000

Example
Input
5
2 19 8 15 4

Output
4 15 8 19 2

Explanation

Self Explanatory */
import java.util.*;

class Reverse_array_recursion {
    public static void rev_arr_rec(int a[] , int p1 , int p2){ // CORE RECUSRSIVE FUNCTION
        if ( p1 >= p2 ) // p1 pointer points at start of the array and p2 pointer at end
            return;
        int temp = a[p1]; // Reversing logic
        a[p1] = a[p2];
        a[p2] = temp;
        rev_arr_rec(a, p1+1 , p2-1); //Inc the start pointer and dec the end pointer 
    }
    public static void reverse (int a[]){ //This is a wrapper function to simplify initial call
        if (a == null || a.length <= 1)
            return;
        rev_arr_rec(a , 0 , a.length-1);
    }
    /* The above wrapper function is optional . 
       If not used then the user has to explicitly mention 
       the start and end pointers everytime in main function 
       while calling the Core recusive function */

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int ar [] = new int [n];
        for(int i=0;i<n;i++)
            ar[i] = sc.nextInt();
        reverse(ar); // Calling the reverse function
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
// TO-DO - TRY DOING THE PROBLEM USING WHILE LOOP INSTEAD OF RECURSION . 