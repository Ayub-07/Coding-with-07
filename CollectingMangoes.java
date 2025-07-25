/**
 **********************************************   MAX    STACK  PROBLEM  *****************************************************************
 Collecting Mangoes
 
 One day after the storm Mina went to pick up mangoes in the garden with a basket. She began to pick up mangoes from the garden. And if she wants, she can throw away the last picked-up mango from the basket. In this way, Mina kept picking up mangoes. She brought you with her to keep track of the biggest size of mango in the basket at that time. At any moment Mina can ask you about the biggest size of mango. Your job is to help Mina.
Since you are a good programmer, you write a program by which you are easily able to answer the questions of Mina. While picking up mangoes, Mina can have 3 types of questions/instructions for you.Type 1: Put an "x" size mango in the basket, which is picked up from the garden.Type 2: Throw out the last picked-up mango.Type 3: Ask for the biggest mango size in the basket at that moment.Input Format
The first line of input contains T - the number of test cases. Each case starts with a positive integer N, which is the number of questions/operations Mina will ask while picking up mangoes. Next N lines will contain 3 types of operations (A, R, Q): A x (where x is picked up mango size), R (Throw out last picked up mango from basket), Q (Find out the biggest size mango).

Output Format
For each test case, first print the case number and print the answer to each of Mina's questions (Queries of Type 3 - Q). Whenever the basket is empty, then Mina's question's answer will be "Empty".

Constraints
30 points
1 <= T <= 100
1 <= N <= 1000
1 <= x <= 100000

70 points
1 <= T <= 100
1 <= N <= 100000
1 <= x <= 100000

Example
Input
2
7
A 10
A 5
Q
A 100
Q
R
Q
6
A 5
Q
R
Q
R
R

Output
Case 1:
10
100
10
Case 2:
5
Empty

 */
import java.util.*;

class CollectingMangoes {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();   //Test cases 
       sc.nextLine();                 
       int test_case = 1;
       while(t-->0){
           Stack <Integer> st1 = new Stack<>();     //Regular stack for storing values
           Stack <Integer> st2 = new Stack<>();     //Max stack for storing maximum values
           System.out.println("Case "+test_case+":");
           int n = sc.nextInt();   //Operations
           sc.nextLine();               
           while(n-->0){
            String s = sc.next();
            if(s.equals("A")){
                int x = sc.nextInt();   // put x size mango in basket
                if(st1.isEmpty()){
                    st1.push(x);
                    st2.push(x);
                }
                else{
                    st1.push(x);
                    if(x >= st2.peek())
                        st2.push(x);
                }
            }
            else if(s.equals("R")){
                if(!st1.isEmpty()){        // Throw last collected mango form the basket
                    int thrown_mango = st1.pop();
                    if(thrown_mango == st2.peek())
                        st2.pop();
                }
            }
            else if(s.equals("Q")){
                if(!st2.isEmpty())
                    System.out.println(st2.peek()); // print biggest size mango.
                else
                    System.out.println("Empty");
            }
           }
           test_case++;
       }
    }
}