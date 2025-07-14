/**
 Reverse the Sentence
 
Given a sentence, reverse the entire sentence word-by-word.

Note: 
 Solve using stack or in-place swap. Do not simply scan, split and print in reverse order.  Input Format
The first line of input contains T - the number of test cases. It's followed by T lines, each containing a sentence S of space-separated words of lowercase English alphabet. All the words are separated by a single space.

Output Format
For each test case, print the reversed sentence, separated by a newline.

Constraints
1 <= T <= 1000
1 <= len(S) <= 1000

Example
Input
3
hello world
a b c d
data structures and algorithms

Output
world hello
d c b a
algorithms and structures data

 */
import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       sc.nextLine();
       while(t-->0){
           String str = sc.nextLine();
           Stack<String> st = new Stack<>();        // Stack for storing each word 
           String ar[] = str.split(" ");            // Seperating each word of the sentence and storing it into an String array
           for(String s : ar){
            st.push(s);
           }
           while(!st.isEmpty()){
           System.out.print(st.pop()+" ");          //MAIN LOGIC
           }
           System.out.println();
        }
    }
}