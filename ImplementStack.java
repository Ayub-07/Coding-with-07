/*
Implement Stack 
Implement the Stack data structure and perform push / pop operations.

Note: 
 Do not use any inbuilt functions / libraries for the Stack.  Input Format
The first line of input contains T - number of operations. It is followed by T lines, each line contains either "push x" or "pop".

Output Format
For each "pop" operation, print the popped element, separated by a newline. If the stack is empty, print "Empty".

Constraints
1 <= T <= 10000
-100 <= x <= 100

Example
Input
8
push 5
pop
pop
push 10
push -15
pop
push -10
pop

Output
5
Empty
-15
-10
 */
import java.util.*;

class ImplementStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.nextLine();
            if(s.equals("push")){
                int x = sc.nextInt();
                list.add(x);
            }
            else{
                if(list.isEmpty()){
                    System.out.println("Empty");
                }
                else{
                    System.out.println(list.remove(list.size()-1));
                }
            }
            
        }
    }
}