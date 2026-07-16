/*   First and Last 

You are given an array A of size N, containing integers. Your task is to find the first and last occurrences of a given element X in the array A and print them.

Input Format
The input consists of three lines. The first line contains a single integer N - the size of the array. The second line contains N integers separated by a space, representing the elements of the array A. The third line contains a single integer X.

Output Format
Print the indexes of the first and last occurrences separated by a space.

Note
It is guaranteed that X is always present in the given array.

Constraints
1 <= N <= 103
1 <= A[i] <= 105
X ∈ A

Example
Input
10
1 3 5 7 9 11 3 13 15 3
3

Output
1 9

Explanation

Self Explanatory*/
import java.util.*;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        int first = 0 , last = n-1;
        while(arr[first] != x){ //Inc first index until the first occurrence of the element is found
            first++;   
        }
        while(arr[last] != x){  //Dec last index until the last occurrence of the element is found
                last--;   
        }
        System.out.print(first+" "+last); //If element is appeared only once in the array then first and last value will be same
        
    }
}