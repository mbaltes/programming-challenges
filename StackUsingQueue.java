/*
  Problem: https://leetcode.com/problems/implement-stack-using-queues/

  Implement the following operations of a stack using queues. 

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    empty() -- Return whether the stack is empty.

  Notes:

  You must use only standard operations of a queue -- which means only push 
  to back, peek/pop from front, size, and is empty operations are valid.
  Depending on your language, queue may not be supported natively. You may 
  simulate a queue by using a list or deque (double-ended queue), as long as 
  you use only standard operations of a queue. You may assume that all 
  operations are valid (for example, no pop or top operations will be called 
  on an empty stack).

*/

package hackerrank;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
  Queue<Integer> mainQ = new LinkedList<>();
  
  public void pop() {
    if (!mainQ.isEmpty()) {
      mainQ.poll();
    }
  }
  
  public void push(int x) {
    Queue<Integer> tempQ = new LinkedList<>();
    if (!mainQ.isEmpty()) {
      while (!mainQ.isEmpty()) {
        tempQ.offer(mainQ.poll());
      }
      mainQ.offer(x);
      while (!tempQ.isEmpty()) {
        mainQ.offer(tempQ.poll());
      }
    } else {
      mainQ.offer(x);
    }
  }
  
  public int top() {
    return mainQ.peek();
  }
  
  public boolean empty() {
    return mainQ.isEmpty();
  }
  
  public void show() {
    if (!mainQ.isEmpty()) {
      System.out.print(mainQ.peek());
    }
  }
  
  public static void main(String[] args) {
    StackUsingQueue s = new StackUsingQueue();
    s.push(5);
    s.show();
    s.pop();
    s.push(6);
    s.show();
  }
}
