/*
A power B 

Given 2 numbers - A and B, evaluate A^B.

Note: 
 Do not use any inbuilt functions / libraries for your main logic.  Input Format
The first line of input contains T - the number of test cases. It's followed by T lines, each line containing 2 numbers - A and B, separated by space.

Output Format
For each test case, print AB, separated by new line. Since the result can be very large, print result % 1000000007

Constraints
30 points
1 <= T <= 1000
0 <= A <= 106
0 <= B <= 103

70 points
1 <= T <= 1000
0 <= A <= 106
0 <= B <= 109

Example
Input
4
5 2
1 10
2 30
10 10

Output
25
1
73741817
999999937 */

import java.util.*;

class ApowerB {
    final static int MOD = 1000000007;              //Since result can be very large so declare mod 
    public static long power (long a , long B){
        long pow = 1;
        while(B!=0){
            if((B & 1) == 1){       // Checking SET Bits
                pow=(pow*a)%MOD;      // MAIN LOGIC
            }
            B = B >> 1;
            a=(a*a)%MOD;              //Updating base value
        }
        return pow %MOD ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(power(a,b));
        }
    }
}