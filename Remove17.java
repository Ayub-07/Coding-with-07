/*
  ***************************THIS IS ONE OF THE PROGRAM WHICH WAS ASKED IN OUR PRE PLACEMENT CODING ASSESSMENT .*************************

  You are given a string consisting of digits (0–9). Your task is to repeatedly remove any pair of adjacent digits whose sum is equal to 17.

The process continues until no more such pairs exist in the string.

The resulting string size should be printed as the output.


Constraints

1 ≤ length of string ≤ 10⁵

Digits are between 0–9

Only adjacent pairs can be removed.

The only possible pairs are (8, 9) or (9, 8) since 8 + 9 = 17.

Example 1

Input:

18934598

Process:

1 (8,9) 34598 → remove (8,9) → "134598"

1345 (9,8) → remove (9,8) → "1345"

Output:

4

Example 2

Input:

9898

Process:

(9,8)98 → remove → "98"

(9,8) → remove → ""

Output: 0

Empty
 */

/* I USED STACK APPROACH FOR THIS , WHICH I GUESS IS THE MOST OPTIMAL APPROACH FOR THIS PROBLEM :) . T.C -> O(n)  S.C -> O(n)  */


import java.util.*;
class Remove17{
  public static int remove17(String num) {
      Stack<Character> st = new Stack<>();
      char ar[] = num.toCharArray();
      for(char ch : ar){
        if (st.isEmpty() ||st.peek()=='9' && ch!= '8' || st.peek()=='8' && ch!= '9')
          st.push(ch);
        else 
          st.pop();
      }
      return st.size();
  }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number string: ");
        String num = sc.next();
 
        int result = remove17(num);
        
        System.out.println("Size of reduced string: " + result);

        sc.close();
  }
}