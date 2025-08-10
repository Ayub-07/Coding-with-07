/**
 * *************************************************
 * *************************************************          LEETCODE PROBLEM - 20 . VALID PARENTHESIS
 * *************************************************
 
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.*/

/**** APPROACH -1 USING STACK   T.C -> O(n) ------ S.C -> O(n) Runtime = 2 m/s (leetcode) *****/
import java.util.*;
public class ValidParenthesis{
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char ar [] = s.toCharArray();
        for(char c : ar){
            if (c=='('||c=='{'||c=='[')
                st.push(c);
            else {
                if(st.empty() || (st.peek()=='(' && c!=')') || (st.peek()=='{' && c!='}') || (st.peek()=='[' && c!=']'))
                    return false;
                st.pop();
        }
        }
        return st.isEmpty();
    }
}
/**** APPROACH -2 WITHOUT USING STACK   T.C -> O(n) ------ S.C -> O(n) Runtime = 1 m/s (leetcode) *****/

class validParenthesis {
    public boolean isValid(String s) {
        int n = s.length();
        char carr [] = s.toCharArray();
        char ar [] = new char [n];          // This array acts as stack
        int top = -1;                       // User defined stack pointer 
        for(char c : carr){
            if(c=='(' || c=='{' || c=='[')
                ar[++top] = c;
            else if (top==-1 || (c==')' && ar[top]!='(') ||
                                (c=='}' && ar[top]!='{') ||
                                (c==']' && ar[top]!='['))
                return false;
            else
                top--;
        }
        return top == -1;
    }
}