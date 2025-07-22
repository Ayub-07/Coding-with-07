/*
Longest Palindromic Substring 

Given a string, find the length of the Longest Palindromic Substring (LPS).

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line has N - the size of the string and the second line contains a string of size N.

Output Format
Print the length of the LPS for each test case, separated by a new line.

Constraints
30 points
1 <= T <= 200
1 <= len(S) <= 100
'a' <= S[i] <= 'z'

70 points
1 <= T <= 200
1 <= len(S) <= 103
'a' <= S[i] <= 'z'

General Constraints
'a' <= S[i] <= 'z'

Example
Input
5
8
pfyafafd
9
sllwffoqq
6
yoogvb
4
hcch
23
mzmqnnrkurfmmfrukrnnqsm

Output
3
2
2
4
18 */

//EXPAND AROUND CENTRE APPROACH

import java.util.*;

public class LongestPalindromicSubString {
    public static int LPS(String str , int n){
        int ans = 0;
        for(int i=0;i<n;i++){
            int len1 = checkPal(str , i , i); //ODD PALINDROM
            int len2 = checkPal(str , i , i+1); //EVEN PALINDROM
            int max_len = Math.max(len1,len2);
            ans = Math.max(ans,max_len);
        }
        return ans;
    }
    public static int checkPal(String str , int p1 , int p2){
        while(p1>=0 && p2<str.length() && str.charAt(p1)==str.charAt(p2)){      //MAIN LOGIC
            p1--;
            p2++;
        }
        return p2-p1-1;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            System.out.println(LPS(str , n));
        }
    }
}