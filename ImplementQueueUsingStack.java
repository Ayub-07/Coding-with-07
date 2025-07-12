/*
*****************************************                                                                *********************************
*****************************************      LEETCODE PROBLEM - 232 . IMPLEMENT QUEUE USING STACKS     *********************************
*****************************************                                                                ********************************

Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 

Example 1:

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
 

Constraints:

1 <= x <= 9
At most 100 calls will be made to push, pop, peek, and empty.
All the calls to pop and peek are valid. */
import java.util.*;

class ImplementQueueUsingStack {
    Stack <Integer> st1;
    Stack <Integer> st2;
    public ImplementQueueUsingStack() {
        st1 = new Stack<>();    // Normal stack
        st2 = new Stack<>();    // Stack 2 acts as queue 
    }
    
    public void push(int x) {
       st1.push(x);
    }
    
    public int pop() {
        if(!st2.isEmpty()){
            return st2.pop();
        }
        else{
            while(!st1.isEmpty()){      // pushing stack1 elements to stack2 
                st2.push(st1.pop());
            }
            return st2.pop();
        }
    }
    
    public int peek() {
        if(!st2.isEmpty())
            return st2.peek();
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            return st2.peek();
        }
    }
    
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty(); //Only if the two stacks are empty then 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */