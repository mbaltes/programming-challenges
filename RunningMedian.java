package hackerrank;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {
  // Member data
  public PriorityQueue<Integer> minHeap = new PriorityQueue<>();
  public PriorityQueue<Integer> maxHeap = new PriorityQueue<>(1, Collections.reverseOrder());
  public double median;
  
  // Member functions
  
  // O(log(n))
  public void insert(int n) { // Integer vs int here?
    if (minHeap.peek() == null) {
      minHeap.add(n);
      return;
    }
    median = this.getMedian();
    if (n >= median) {
      minHeap.add(n);
    } else {
      maxHeap.add(n);
    }
    // Re-order if necessary
    if (Math.abs(minHeap.size() - maxHeap.size()) > 1) {
      if (minHeap.size() > maxHeap.size()) {
        int temp = minHeap.poll();
        maxHeap.add(temp);
      } else {
        int temp = maxHeap.poll();
        minHeap.add(temp);
      }
    }
  }
  
  // O(1)
  public double getMedian() {
    if (minHeap.size() + maxHeap.size() == 0) {
      return 0;
    }
    if ((minHeap.size() + maxHeap.size()) % 2 != 0) {
      if (minHeap.size() > maxHeap.size()) {
        return minHeap.peek();
      } else {
        return maxHeap.peek();
      } 
    } else {
      return ((double)minHeap.peek() + maxHeap.peek()) / 2;
    }
  }
  
  // Test using main.
  public static void main(String[] args) {
    RunningMedian test = new RunningMedian();
    test.insert(1);
    test.insert(2);
    test.insert(3);
    test.insert(4);
    test.insert(5);
    test.insert(6);
    System.out.println("Min Heap Root: " + test.minHeap.peek());
    System.out.println("Max Heap Root: " + test.maxHeap.peek());
    System.out.println("Median: " + test.getMedian());
  }
}