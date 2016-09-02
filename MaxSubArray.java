/*
  Problem: Max subarray sum. 
*/

package hackerrank;

public class MaxSubArray {
  public static void main(String[] args) {
    int[] array = {-7, -5, -4, 5, 6, 4, -4};
    System.out.println(maxSubArray(array));
  }

  // O(n) 
  private static int maxSubArray(int[] array) {
    int maxEndingHere = 0, maxSoFar = 0;
    for (int x : array) {
      maxEndingHere = max(0, maxEndingHere + x);
      maxSoFar = max(maxSoFar, maxEndingHere);
    }
    return maxSoFar;
  }

  private static int max(int a, int b) {
    return (a > b) ? a : b;
  }
}
