/* 
    Problem: https://www.hackerrank.com/challenges/java-loops
    Status: Working
    Todo: 
*/

import java.util.*;
import java.math.*;

public class JavaLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_cases = input.nextInt();
        
        for (int i = 0; i < num_cases; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int base = a + (int)Math.pow(2, 0) * b;
            System.out.printf(base + " ");
            for (int j = 1; j < n; j++) {
                int current = (int)Math.pow(2, j) * b;
                base += current;
                System.out.printf(base + " ");
            }
            System.out.println();
        }
    }
}