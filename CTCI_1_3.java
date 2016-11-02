/* Notes:
 * 
 * 1.3: Given two strings write a method to decide if one is a permutation
 * of the other.
 * 
 * Ideas:
 * 1) Sort the strings. Then iterate over them to check if same.
 * Time O(nlogn), Space O(n)
 * 
 * CTCI answer) The same.
 * 
*/

package ctci;

import java.util.Arrays;

public class CTCI_1_3 {
  
  public static String reverse(String s) {
    char[] temp = s.toCharArray();
    Arrays.sort(temp);
    String soln = String.valueOf(temp);
    return soln;
  }
  
  public static boolean checkPerm(String a, String b) {
    if (a.length() != b.length()) return false;
    
    return reverse(a).equals(reverse(b));
  }
  
  public static void main(String[] args) {
    System.out.println(checkPerm("hello", "olleh"));
  }
}
