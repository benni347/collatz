package ch.bbw.cs;

import java.util.Scanner;

public class CollatzConjecture {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = scanner.nextInt();

    while (n <= 0) {
      System.out.println("Please enter a positive integer:");
      n = scanner.nextInt();
    }

    System.out.println("Collatz sequence starting at " + n + ":");
    while (n != 1) {
      System.out.print(n + " ");
      if (n % 2 == 0) {
        n /= 2;
      } else {
        n = 3 * n + 1;
      }
    }
    System.out.println(n); // Print 1 at the end of the sequence
  }
}
