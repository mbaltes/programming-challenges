/*
  Problem: https://leetcode.com/problems/number-of-1-bits/

  Write a function that takes an unsigned integer and returns the number of ’1' 
  bits it has (also known as the Hamming weight).

  For example, the 32-bit integer ’11' has binary representation 
  00000000000000000000000000001011, so the function should return 3.

*/

package hackerrank;

public class HammingWeight {
  public static void main(String[] args) {
    int n = 11;
    System.out.println(hammingWeight(n));
  }

  private static int hammingWeight(int n) {
    String s = Integer.toBinaryString(n);
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') {
        count++;
      }
    }
    return count;
  }
}
