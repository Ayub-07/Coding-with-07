/*
>>>>>>>>>>>>>>>>>>>>>>>>>>>>                                                                  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
----------------------------------------------LEETCODE PROBLEM - 155 "MIN STACK"----------------------------------------------------------
>>>>>>>>>>>>>>>>>>>>>>>>>>>>                                                                  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 

Constraints:

-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin. */
import java.util.*;

class MinStack {
    Stack <Integer> st1;          //Regular stack for storing values
    Stack <Integer> st2;          //Min Stack for storing minimum values
    public MinStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int val) {
        if(st1.isEmpty()){
            st1.push(val);
            st2.push(val);
        }
        else{
            st1.push(val);
            if(val<=st2.peek()){          // Only the minimum values are oushed to stack2 i.e. MinStack
                st2.push(val);
            }
        }
    }
    
    public void pop() {
        int popped_val = st1.pop();
        if(popped_val == st2.peek()){
            st2.pop();
        }
    }
    
    public int top() {
        if(!st1.isEmpty())
            return st1.peek();
        return -1;
    }
    
    public int getMin() {
        if(!st2.isEmpty())
            return st2.peek();
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */