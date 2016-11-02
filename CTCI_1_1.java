/* Notes:
 * 
 * 1.1: Implement algorithm to determine if a string has all unique 
 * characters. What if you cannot use additional data structures?
 * 
 * Ideas:
 * 1) Sort the string (O(nlogn)) then iterate over it checking neighbor
 * values. Space is linear because of new string created. 
 * 
 * 2) Use a hash table. Iterate over the string adding characters to table
 * as you go, if character already exists return false. 
 * Linear time and space for this.
 * 
 * CTCI answer) Use the fact that ASCII has only 256 available characters.
 * So create a boolean array and iterate over the string checking if 
 * boolean[i] is true, if so return false, else set to true.
 * Linear time and constant space.
 * 
*/

package ctci;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class CTCI_1_1 {
  // Idea 1: Time O(nlogn), Space O(n) + sorting algo space requirement.
  public static boolean isUnique1(String s) {
    char[] temp = s.toCharArray();
    Arrays.sort(temp);
    for (int i = 0; i < temp.length-1; i++) {
      if (temp[i] == temp[i+1]) {
        return false;
      }
    }
    return true;
  }
  
  // Idea 2: Time O(n), Space O(n)
  public static boolean isUnique2(String s) {
    HashMap<Character, Integer> charTable = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (charTable.containsKey(s.charAt(i))) {
        return false;
      } else {
        charTable.put(s.charAt(i), 1);
      }
    }
    return true;
  }
  
  // Idea 3: Time O(n), Space (1)
  public static boolean isUnique3(String s) {
    if (s.length() > 256) return false;
    
    boolean[] charSet = new boolean[256];
    for (int i = 0; i < s.length(); i++) {
      int val = s.charAt(i);
      if (charSet[val]) {
        return false;
      }
      charSet[val] = true;
    }
    return true;
  }
  
  // Test
  public static void main(String[] args) {
    System.out.println(isUnique1("helo"));
    System.out.println(isUnique2("hello"));
    System.out.println(isUnique3("hello"));
  }
}
