/*
Binary Representation bookmark_borderGiven a positive integer, print its binary representation. 

Input Format
 The first line of input contains T - the number of test cases. It's followed by T lines, each line containing a single integer. 

Output Format
 For each test case, print a binary representation, separated by a new line. 

Constraints
 1 <= T <= 10000 
 0 <= N <= 109

Example
Input
 5
 10
 15
 7
 1
 120

Output
 1010
 1111
 111
 1
 1111000
 */

import java.util.*;

public class BinaryRepresentation {
    public static void bin (long n){
        if (n>1)
            bin(n/2);             //Recursion
        System.out.print(n % 2);  // printing remainders when divided by 2   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            bin(n);
            System.out.println();
        }
    }
}
/*
 Let's Trace with Example: n = 5
Binary of 5 is 101.

So what happens when we call bin(5)?

1️ First Call: bin(5)
5 > 1 → true → so it calls bin(5/2) → bin(2)

After recursion, it prints 5 % 2 = 1

2️ Second Call: bin(2)
2 > 1 → true → so it calls bin(2/2) → bin(1)

After recursion, it prints 2 % 2 = 0

3️ Third Call: bin(1)
1 > 1 → false → so recursion stops here.

Then prints 1 % 2 = 1 */