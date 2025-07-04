/*LCM and HCF 
Given 2 numbers, find their LCM and HCF.

Note: Do not use any inbuilt functions / libraries for your main logic. Read about the Euclid Algorithm to solve the problem.  Input Format
The first line of input contains T - the number of test cases. It's followed by T lines, each containing 2 numbers A and B.

Output Format
For each test case, print their LCM and HCF separated by space, separated by a new line.

Constraints
1 <= T <= 105
1 <= A,B <= 109

Example
Input
4
4 710
13 1
6 4
605904 996510762

Output
1420 2
13 1
12 2
7740895599216 78*/
import java.util.*;

class LCMandHCF {
    public static long HCF ( long a , long b){         // Take "long" datatype because the result would overflow int.
        if (b==0)
            return a;
        else 
            return (long) HCF(b,a%b);                   //MAIN LOGIC FOR HCF
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long LCM = ((a * b) / HCF (a,b) )  ;       //MAIN LOGIC FOR LCM
            System.out.println(LCM+" "+HCF(a,b));
        }
    }
}