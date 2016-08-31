/*
  Problem: https://leetcode.com/problems/reverse-string/

  Write a function that takes a string as input and returns the string reversed.

  Example:
  Given s = "hello", return "olleh". 

*/

package hackerrank;

public class ReverseString {
  public static void main(String[] args) {
    String s = "hello";
    System.out.println(reverseBuilder(s));
  }

  // Using a for loop with additional string to solve.
  private static String reverseString(String s) {
    String reversed = new String();
    for (int i = s.length()-1; i >= 0; i--) {
      // In Java strings are immutable, so the following is not efficient.
      // If n concatenations are needed, then n new strings will be created.
      reversed += s.charAt(i); 
    }
    return reversed;
  }
  
  private static String reverseBuilder(String s) {
    StringBuilder n = new StringBuilder();
    for (int i = s.length()-1; i >= 0; i--) {
      // Appending to a StringBuilder is the preferred tool here.
      n.append(s.charAt(i)); 
    }
    return n.toString();
  }
}
