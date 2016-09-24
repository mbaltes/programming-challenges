/*
  Problem: https://www.hackerrank.com/challenges/staircase

  Write a program that prints a staircase of size n.

*/

public class Staircase {
  // Draws staircase of size n.
  public static void triangle(int n) {
    int numSpaces = n - 1;
    while (numSpaces >= 0) {
      for (int i = 0; i < numSpaces; i++) {
        System.out.print(" ");
      }
      int length = n - numSpaces;
      for (int j = 0; j < length; j++) {
        System.out.print("#");
      }
      System.out.println();
      numSpaces--;
    }
  }
  
  public static void main(String[] args) {
    triangle(7);
  }
}
