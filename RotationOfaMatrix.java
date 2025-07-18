/*
Rotation of Matrix 

Given a 2D square matrix, rotate it by 90 degrees clockwise.

Note: 
 Try to solve it by first scanning the matrix, then doing an in-place rotation, and then printing the rotated matrix.  
 
Input Format
The first line of input contains T - the number of test cases. The first line of each test case contains the N - the size of the matrix [NxN]. It is followed by N lines each containing N integers - matrix elements.

Output Format
For each test case, print the rotated matrix, separated by a new line.

Constraints
1 <= T <= 100
1 <= N <= 100
-100 <= ar[i][j] <= 100

Example
Input
4
1
1
2
1 2
4 3
3
1 2 3
8 9 4
7 6 5
5
-44 25 -52 69 -5
17 22 51 27 -44
-79 28 -78 1 -47
65 -77 -14 -21 -6
-96 43 -21 -20 90

Output
Test Case #1:
1
Test Case #2:
4 1
3 2
Test Case #3:
7 8 1
6 9 2
5 4 3
Test Case #4:
-96 65 -79 17 -44
43 -77 28 22 25
-21 -14 -78 51 -52
-20 -21 1 27 69
90 -6 -47 -44 -5 */
import java.util.*;

public class RotationOfaMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int counter = 1;   // Counter for resembling output format (increments for each test case)
        while(t-->0){
            int n = sc.nextInt();
            int a [][] = new int [n][n];            //Declaring the matrix
            for(int i=0;i<n;i++){                   //Scanning the matrix elements
                for(int j=0;j<n;j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){             // Transposing the matrix at step-1
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
            for(int i=0;i<n;i++){
                int left = 0 , right = n-1;
                while(left<right){                  //Reversing each row of the matrix after transposing at step-2 
                    int temp = a[i][left];
                    a[i][left] = a[i][right];
                    a[i][right] = temp;
                    left++;
                    right--;
                }
            }
             System.out.println("Test Case #"+counter+":");
             for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");        //Printing the resultant rotated matrix
                }
                System.out.println();
            }
            counter++;
        }
    }
}