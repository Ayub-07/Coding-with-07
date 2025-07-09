/*
Power of 2 bookmark_borderGiven a number, check if it is a power of 2.

Input Format
The first line of input contains T - the number of test cases. It's followed by T lines, each line containing a single positive integer.

Output Format
For each test case, print "True" or "False", separated by a new line.

Constraints
1 <= T <= 10000
1 <= N <= 1018

Example
Input
5
1
8
10
25
512

Output
True
True
False
False
True
 */
import java.util.*;

class PowerOf_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if((n & n-1)== 0)                 //ONE LINE LOGIC
                System.out.println("True");
            else 
                System.out.println("False");
        }
    }
}